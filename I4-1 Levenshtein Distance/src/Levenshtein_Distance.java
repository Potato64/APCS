/*
Name: Ethan Duer
Project Name: 14-1 Levenshtein Distance
Filename: Levenshtein_Distance.java
Dictionary.txt
Purpose: To find the Levenshtein Distance between two words, with all words between being valid
Pseudocode: Gets words from a text file, and converts it to a list. A map is generated from the list,
with the keys being the words in the list, and the value being a set of the words that are one edit distance
from the key. A list is then generated from the map by adding all the words in the set of the first words to
the end of the list, and removing the first word. If the ending word is detected, the distance is printed
Maintenance log:
3/5/18: Project created
3/5-14/18: Worked on project
3/15/18: Discovered that adding and removing letters count as valid edits, had to edit loop that generates map
3/16/18: Fixed bug involving location of break statement, added way for user to view map generation progress,
finished project
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Levenshtein_Distance {

	public static void main(String[] args) 
	{

		ArrayList<String> words = getWords();
		Scanner input = new Scanner(System.in);
		System.out.println("What is the starting word?");
		String start;
		do
		{
			start = input.nextLine();
			if (!words.contains(start))
			{
				System.out.println("The ending word is not a valid word!");
			}
		} while (!words.contains(start));
		System.out.println("What is the ending word?");
		String end;
		do
		{
			end = input.nextLine();
			if (!words.contains(end))
			{
				System.out.println("The ending word is not a valid word!");
			}
		} while (!words.contains(end));
		input.close();
		
		int wordsSize = words.size();
		HashMap<String, Set<String>> map = new HashMap<String, Set<String>>();
		for (int c = 0; c < wordsSize; c++)
		{
			if (c % 780 == 0)
			{
				System.out.println("Map " + String.format("%.0f", c / 39.02) + "% complete");
			}
			String mapWord = words.get(c);
			map.put(mapWord, new HashSet <String>());
			for (int i = 0; i < wordsSize; i++)
			{
				String word = words.get(i);
				int wordLength = word.length();
				int mapWordLength = mapWord.length();
				for (int j = 0; j < wordLength && j < mapWordLength; j++)
				{
					if (word.charAt(j) != mapWord.charAt(j))
					{
						if (mapWordLength == wordLength)
						{
							if (mapWord.regionMatches(true, j + 1, word, j + 1, wordLength - j - 1))
							{
								map.get(mapWord).add(word);
							}
						}
						else if (wordLength - mapWordLength == 1 && mapWord.regionMatches(true, j, word, j + 1, mapWordLength - j)
								|| mapWordLength - wordLength == 1 && mapWord.regionMatches(true, j + 1, word, j, wordLength - j))
						{
							map.get(mapWord).add(word);
							break;
						}
						break;
					}
				}
				
			}
		}
		
		ArrayList<String> list = new ArrayList<String>(map.get(start));
		ArrayList<String> removed = new ArrayList<String>();
		removed.add(start);
		int editDist = 1;
		int wordCount = 0;
		int currSize = list.size();

		list.add(start);
		while (list.size() > 0 && list.indexOf(end) == -1)
		{
			String removedWord = list.remove(0);
			wordCount++;
			removed.add(removedWord);
			list.addAll(map.get(removedWord));
			list.removeAll(removed);
			if (wordCount == currSize)
			{
				editDist++;
				currSize = list.size();
				wordCount = 0;
			}
			else if (list.indexOf(end) != -1)
			{
				editDist++;
			}
		}
		
		if (list.size() > 0)
		{
			if (start.equals(end))
			{
				editDist = 0;
			}
			System.out.println("Edit distance: " + editDist);
		}
		else
		{
			System.out.println("No possible path found!");
		}
	}

	private static ArrayList<String> getWords()
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
			return null;
		}
		ArrayList<String> list = new ArrayList<String>();
		while (input.hasNext())
		{
			list.add(input.nextLine().toLowerCase());
		}
		input.close();
		return list;
	}
}
