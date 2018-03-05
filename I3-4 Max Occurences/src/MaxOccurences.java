import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/*
Name: Ethan Duer
Project Name: 13-4 Max Occurrences
Filename: MaxOccurences.java
Purpose: To return the number of times the mode appears
Pseudocode: Creates a list of numbers and sends it to a function.
The function uses a map in order to count the number of times each number appears in the list.
The maximum value is then found in the list of values, and returned.
Maintenance log:
2/23/18: Project created
2/28/18: Function finished
*/

public class MaxOccurences {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(1);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		System.out.println(maxOccurences(list));
	}

	public static int maxOccurences(ArrayList<Integer> list)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : list)
		{
			if (map.putIfAbsent(num, 1) != null)
			{
				map.replace(num, map.get(num) + 1);
			}
		}
		Collection<Integer> values = map.values();
		int max = 0;
		for (int value : values) 
		{
			if (value > max)
			{
				max = value;
			}
		}
		return max;
	}
}
