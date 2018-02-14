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
