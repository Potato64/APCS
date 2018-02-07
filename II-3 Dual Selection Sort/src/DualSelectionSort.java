/*
Name: Ethan Duer
Project Name: 11-3 Dual Selection Sort
File Name: DualSelectionSort.java
Purpose: To create a selection sort that selects both the smallest and the largest items in an array,
and move them both to the correct location
Pseudocode: Creates an array, and passes it to a sort function. The sort creates a variable to keep track
of the large items, and uses a for loop that goes from the start, to the large item tracker.
The function then finds the smallest and largest items in the array, and swaps them to the loop variable,
and the large item tracker respectively. It then returns the array.
Maintenance Log:
2/4/18: Project Created
2/5/18: Worked on sort function
*/

import java.util.Arrays;

public class DualSelectionSort 
{
	public static void main(String[] args) 
	{
		int[] array = {5, 7, 9, 2, 1, 2, 5, 7, 8, 10, 0, 2, 3, 5, 4, 7, 6, 1};
		//int[] array = {7, 1, 3, 1, 9, 2, 6, 5};
		//int[] array = {2, 1, 3};
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void sort(int[] array)
	{
		int largeWall = array.length - 1;
		for(int c = 0; c < largeWall; c++)
		{
			int smallIndex = c;
			int largeIndex = largeWall;
			for (int i = c; i <= largeWall; i++)
			{
				int num = array[i];
				if (num < array[smallIndex])
				{
					smallIndex = i;
				}
				if (num > array[largeIndex])
				{
					largeIndex = i;
				}
			}
			
			int temp = array[smallIndex];
			array[smallIndex] = array[c];
			array[c] = temp;
			
			if (largeIndex == c)
			{
				largeIndex = smallIndex;
			}
			
			temp = array[largeIndex];
			array[largeIndex] = array[largeWall];
			array[largeWall] = temp;
		
			largeWall--;
		}
	}
}
