/*
Name: Ethan Duer
Project Name: 12-2 Print Reverse
Filename: PrintReverse.java
Purpose: To create a function that prints the characters of the string in reverse order
Pseudocode: Gets a string from the user and passes it to a function. 
It then goes through the string in reverse order, and prints each character
Maintenance log:
2/12/18: Project created
*/

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What string would you like to have printed in reverse?");
		String string = input.nextLine();
		input.close();
		printReverse(string);
	}
	
	public static void printReverse(String string)
	{
		for(int c = string.length() - 1; c >= 0; c--)
		{
			System.out.print(string.charAt(c));
		}
		System.out.println();
	}
}
