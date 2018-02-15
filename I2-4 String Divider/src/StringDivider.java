/*
Name: Ethan Duer
Project Name: 12-4 String Divider
Filename: StringDivider.java
Purpose: To get a string and an int from the user, and splits the string into substrings of length n
Pseudocode: Get a string and a num from the user, and pas it to a function.
The function iterates through the string incrementing by n each time,
and prints out the substring from the iterator to the iterator minus n. There is a second function
identical in function to the first, that uses regex to split the string, because regex is cool.  
Maintenance log:
2/14/18: Project created
Regex function created
2/15/18: Loop function created
Regex function modified to be less buggy
*/

import java.util.Scanner;

public class StringDivider {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your string?");
		String string = input.nextLine();
		System.out.println("What is your substring length?");
		int num = input.nextInt();
		stringDivider(string, num);
		System.out.println();
		stringDivider2(string, num);
		input.close();
	}
	
	public static void stringDivider(String string, int num)
	{
		int c;
		for (c = num; c <= string.length(); c += num)
		{
			System.out.println(string.substring(c - num, c));
		}
		System.out.println(string.substring(c - num));
	}

	public static void stringDivider2(String string, int num)
	{
		String[] parts = string.split("(?<=^(.{" + num + "}){1," + string.length() / num + "})");
		for (int c = 0; c < parts.length; c++)
		{
			System.out.println(parts[c]);
		}
	}
}
