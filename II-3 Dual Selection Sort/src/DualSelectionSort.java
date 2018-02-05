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
		//int[] array = {5, 7, 9, 2, 1, 2, 5, 7, 8, 10, 0, 2, 3, 5, 4, 7, 6, 1};
		int[] array = {7, 1, 3, 9, 2, 6};
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
			int smallIndex = c;
			int largeIndex = largeWall;
			for (int i = c + 1; i <= largeWall; i++)
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
			System.out.println(Arrays.toString(array));
			System.out.println("" + array[smallIndex] + "," + array[largeIndex]);
			if (largeIndex != c && smallIndex != largeWall)
			{
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
