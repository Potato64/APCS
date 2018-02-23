import java.util.Scanner;

/*
Name: Ethan Duer
Project Name: 12-5 Stair String
File Name: StairString.java
Purpose: Creating a function that takes a string, splits it into n number of substrings,
and prints each substring on its own line, below where it would've been had they been on the same line.
Pseudocode: Get a string and an int from the user, and pass it to a function.
The function determines how long each substring needs to be, and creates an array with a length
equal to the number of lines the user wants the string to be on.
The function then splits the string into substrings, and puts them into the array
with leading spaces so they are below their previous position when printed.
The array is then printed
Maintenance Log:
2/15/18: Project created
2/16/18: Fixed bug with adding an extra space
*/

public class StairString {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What string would you like split?");
		String string = input.nextLine();
		System.out.println("How many lines would you like it on?");
		int num = input.nextInt();
		stairString(string, num);
		input.close();
	}

	public static void stairString (String string, int lines)
	{
		String[] substrings = new String[lines];
		int substringLength = (int) Math.ceil((double)string.length() / lines);
		int c;
		for (c = 0; c < string.length() - substringLength; c += substringLength)
		{
			substrings[c / substringLength] = String.format("%" + (c + substringLength) + "s", string.substring(c, substringLength + c));
		}
		substrings[((double)string.length() / lines > 1) ? lines - 1 : c] = String.format("%" + (string.length()) + "s", string.substring(c));
		for (c = 0; c < lines; c++)
		{
			if (substrings[c] != null)
			{
				System.out.println(substrings[c]);
			}
		}
	}
}
