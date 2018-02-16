/*
Name: Ethan Duer
Project Name: 12-1 PadString
Filename: PadString.java
Purpose: To get a string from the user, and pad it with a specified number of spaces
Pseudocode: Get a string from the user, and pass it to padString.
PadSting uses String.format to pad the string with spaces
Maintenance log:
2/9/18: Project created
*/

import java.util.Scanner;

public class PadString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is your string?");
		String string = input.nextLine();
		System.out.println("How long do you want it to be?");
		int length = input.nextInt();
		input.close();
		System.out.println(padString(string, length));
		System.out.println(padStringCat(string, length));
	}

	public static String padString(String string, int length)
	{
		return String.format("%-" + length + "s", string);
	}
	
	public static String padStringCat(String string, int length)
	{
		while (string.length() < length)
		{
			string += " ";
		}
		return string;
	}
}
