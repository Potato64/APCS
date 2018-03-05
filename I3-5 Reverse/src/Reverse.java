/*
Name: Ethan Duer
Project Name: 13-5 Other Exercise
Filename: Reverse.java
Purpose: To complete the Chapter 11 exercise 18, which is to create a function that takes a HashMap,
and reverses the keys and the values
Pseudocode: 
Creates a map, and passes it to a function. The function takes the map's keys and creates a new map
, and for every key's value, if the new map contains the value as a key already,
it adds the old key to the collection of keys for the new key. Otherwise, it creates a new mapping
with a new set, and adds the old key to the set
Maintenance log:
3/2/18: Project created
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Reverse {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("42", "Marty");
		map.put("81", "Sue");
		map.put("17", "Ed");
		map.put("31", "Dave");
		map.put("56", "Ed");
		map.put("3", "Marty");
		map.put("29", "Ed");
		System.out.println(reverse(map));
	}

	public static HashMap<String, Set<String>> reverse(HashMap<String, String> map)
	{
		HashMap<String, Set<String>> reverse = new HashMap<String, Set<String>>();
		Set<String> keys = map.keySet();
		for (String key : keys)
		{
			String reverseKey = map.get(key);
			if (reverse.containsKey(reverseKey))
			{
				reverse.get(reverseKey).add(key);
			}
			else
			{
				reverse.put(reverseKey, new HashSet<String>());
				reverse.get(reverseKey).add(key);
			}
		}
		return reverse;
	}
}
