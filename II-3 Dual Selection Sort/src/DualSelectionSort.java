/*
Name: Ethan Duer
Project Name: 
File Name: 
Purpose: 
Pseudocode: 
Maintenance Log:
2/4/18: Project Created
*/

import java.util.Arrays;

public class DualSelectionSort 
{
	public static void main(String[] args) 
	{
		int[] array = {5, 7, 9, 2, 1, 2, 5, 7, 8, 10, 0, 2, 3, 5, 4, 7, 6, 1};
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void sort(int[] array)
	{
		if (array.length == 0)
		{
			throw new IllegalArgumentException("Array length must be greater than 0");
		}
		if (array.length == 1)
		{
			return;
		}
		int largeWall = array.length - 1;
		for(int c = 0; c < largeWall; c++)
		{
			for (int i = c; i <= largeWall; i++)
			{
				int smallIndex = array[c];
				int largeIndex = array[largeWall];
				int num = array[i];
				if (num < smallIndex)
				{
					smallIndex = num;
				}
				if (num > largeIndex)
				{
					largeIndex = num;
				}
				int temp = array[smallIndex];
				array[smallIndex] = array[c];
				array[c] = temp;
				
				temp = array[largeIndex];
				array[largeIndex] = array[largeWall];
				array[largeWall] = temp;
			}
			largeWall--;
		}
	}
}
