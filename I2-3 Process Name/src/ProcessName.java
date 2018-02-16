/*
Name: Ethan Duer
Project Name: 12-3 Process Name
Filename: ProcessName.java
Purpose: To create a function that takes a scanner for the console,
gets the user's full name, and prints the user's name in last name, first name order
Pseudocode: Create a new scanner for the console, and pass it to the function.
The function prompts the user for their full name using the scanner,
and then prints it last name, first name order
Maintenance log:
2/13/18: Project created
2/14/18: Realized there was a misunderstanding of the requirements after looking at the book,
fixed function
*/

import java.util.Scanner;

public class ProcessName {

	public static void main(String[] args) 
	{
		processName(new Scanner(System.in));
	}

	private static void processName(Scanner scanner)
	{
		System.out.println("What is your full name?");
		String name = scanner.nextLine();
		System.out.printf("Reverse: %s, %s", name.substring(name.lastIndexOf(" ") + 1), name.substring(0, name.lastIndexOf(" ")));
	}
}
