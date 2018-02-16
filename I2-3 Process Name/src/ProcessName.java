/*
Name: Ethan Duer
Project Name: 12-3 Process Name
File Name: ProcessName.java
Purpose: To create a function that takes a scanner for the console, and gets the user's full name.
The program then prints the name in reverse order
Pseudocode: Pass a new scanner with the console as a parameter to a function.
The function gets the user's name and returns it to main. A for loop prints the string character
by character in reverse.
Maintenance Log:
2/13/18: Project created
*/

import java.util.Scanner;

public class ProcessName {

	public static void main(String[] args) 
	{
		String name = processName(new Scanner(System.in));
		for(int c = name.length() - 1; c >= 0; c--)
		{
			System.out.print(name.charAt(c));
		}
		System.out.println();
	}

	private static String processName(Scanner scanner)
	{
		System.out.println("What is your full name?");
		String name = scanner.nextLine();
		return name;
	}
}
