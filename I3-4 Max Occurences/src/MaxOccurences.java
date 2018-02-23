import java.util.ArrayList;
import java.util.HashMap;

/*
Name: Ethan Duer
Project Name: 
Filename: 
Purpose: 
Pseudocode: 
Maintenance log:

*/

public class MaxOccurences {

	public static void main(String[] args) {

	}

	public static int maxOccurences(ArrayList<Integer> list)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : list)
		{
			map.putIfAbsent(num, 0);
		}
	}
}
