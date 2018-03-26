import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Name: Ethan Duer
Project Name: 14-3 Anagram
Filename: Anagram.java
Purpose: To find all the anagrams of a word
Pseudocode: Gets the word from a dictionary, and sorts the letters in the word.
The sorted word is put into the map as the key, with a set as the value
The word is then added to the set. A word is then retrieved from the user, and its letters are sorted.
The sorted word's set is then retrieved from the map, and printed
Maintenance log:
3/21/18: Project Created
*/

public class Anagram {

	public static void main(String[] args) 
	{
		HashMap<String, Set<String>> words = new HashMap<String, Set<String>>();
		File wordfile = new File("dictionary.txt");
		Scanner input;
		try 
		{
			input = new Scanner(wordfile);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			return;
		}
		while (input.hasNext())
		{
			String word = input.nextLine();
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String canonicalWord = String.valueOf(letters);
			words.putIfAbsent(canonicalWord, new HashSet<String>());
			words.get(canonicalWord).add(word);
		}
		input.close();
		System.out.println("What is your word?");
		input = new Scanner(System.in);
		String word = input.nextLine();
		input.close();
		char[] letters = word.toCharArray();
		Arrays.sort(letters);
		Set<String> anagrams = words.get(String.valueOf(letters));
		if (anagrams != null) 
		{
			anagrams.remove(word);
			System.out.println(anagrams.isEmpty() ? "No anagrams found!" : "Anagrams: " + anagrams);
		}
		else
		{
			System.out.println("No anagrams found!");
		}
	}

}
