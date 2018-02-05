/*
Name: Ethan Duer
Project Name: 11-1 Dictionary Difference
File Name:
DictionaryDifference.java
Dictionary.txt
Purpose: Create a function that uses binary search to find the position of a word in a dictionary,
and use it to find how many words are between two different words.
Pseudocode: Read the dictionary from a file, and convert it to an array. It then gets two words from the user,
and passes them to the search function, along with the dictionary array. The search function compares the word being search for
and compares it to the middle item in the array. If the searched word is smaller than the middle array, the function passes the upper
half of the array back to itself, otherwise it passes the lower half. If the middle and searched words are the same,
the number is returned.
Maintenance Log:
2/3/18: Project created
2/4/18: Removed extra spaces from the dictionary
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DictionaryDifference {

	public static void main(String[] args) 
	{
		File words = new File("Dictionary");
		Scanner input;
		try 
		{
			input = new Scanner(words);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			return;
		}
		ArrayList<String> list = new ArrayList<String>();
		while (input.hasNext())
		{
			list.add(input.nextLine().toLowerCase());
		}
		input.close();
		String[] listArray = new String[list.size()];
		list.toArray(listArray);
		Scanner user = new Scanner(System.in);
		System.out.println("What is your first word?");
		String first = user.nextLine();
		System.out.println("What is your second word?");
		String second = user.nextLine();
		user.close();
		int firstPos;
		int secondPos;
		try
		{
			firstPos = binaryFind(first, listArray);
			secondPos = binaryFind(second, listArray);
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("You did not enter a valid word!");
			return;
		}
		System.out.println("Words between: " + (Math.abs(firstPos - secondPos) - 1));
		
	}
	
	public static int binaryFind(String word, String[] words)
	{
		int compare = words[words.length / 2].compareTo(word);
		if (compare == 0)
		{
			return words.length / 2;
		}
		else if (words.length == 1)
		{
			throw new IllegalArgumentException("Word not found");
		}
		else if (compare > 0)
		{
			return binaryFind(word, Arrays.copyOfRange(words, 0, words.length / 2));
		}
		else
		{
			return binaryFind(word, Arrays.copyOfRange(words, words.length / 2 , words.length)) + words.length / 2;
		}
	}

}
