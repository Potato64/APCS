import java.util.Scanner;

/*
Name: Ethan Duer
Project Name: 14-2 Palindrome
Filename: Palindrome.java
Purpose: To determine if two strings are reverses of each other, ignoring capitalization
Pseudocode: Gets two words from the user, and passes them to isReverse.
isReverse tests if the two characters on the ends of the strings are the same,
and if they are, passes the strings minus the end characters to itself recursively.
Maintenance log:
3/19/18: Project created
3/21/18: Fixed bug when strings are different lengths, made it ignore capitalization
*/

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("First word?");
		String forward = input.nextLine();
		System.out.println("Second word?");
		String backward = input.nextLine();
		input.close();
		System.out.println("Is Reverse: " + isReverse(forward, backward));
	}

	public static boolean isReverse(String forward, String backward)
	{
		return forward.equals("") && backward.equals("")
				|| forward.length() == backward.length()
				&& forward.toLowerCase().charAt(0) == backward.toLowerCase().charAt(backward.length() - 1)
				&& (forward.length() == 1
				|| isReverse(forward.substring(1, forward.length()), backward.substring(0, backward.length() - 1)));
	}
}
