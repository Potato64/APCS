import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
Name: Ethan Duer
Project Name: 11-4 Student Grade File
Filename: 
StudentGradeFile.java
Student.java
StudentComparatorLast.java
StudentComparatorFirst.java
StudentComparatorID.java
StudentComparatorPercentage.java
StudentComparatorGrade.java
StudentData.txt
Purpose: To read a list of data from a file, and allow the user to sort the data a variety of ways using comparators
Pseudocode: Gets the data from a file, and puts it into an ArrayList. It gets the sort choice from the user,
and creates a comparator to sort the list using that choice.
Maintenance log:
2/7/18: Project Created
2/8/18: Comparators created
Finished the user input system
*/



public class StudentGradeFile
{
	
	public static void main(String[] args) 
	{
		ArrayList<Student> StudentGrades = scanFile("StudentData");
		Scanner input = new Scanner(System.in);
		int choice;
		do
		{
			Iterator<Student> i = StudentGrades.iterator();
			while (i.hasNext())
			{
				System.out.println(i.next());
			}
			System.out.println("");
			System.out.println("What would you like to sort by?\n1. Last Name\n2. First Name\n3. ID Number\n4. Grade Percentage\n5. Letter Grade\n6. Sort Descending\n7. Quit");
			do
			{
				while (!input.hasNextInt())
				{
					if (input.hasNext())
					{
						input.next();
					}
				}
				choice = input.nextInt();
			} while (choice < 1 || choice > 7);
			boolean descending = false;
			if (choice == 6)
			{
				descending = true;
				System.out.println("What would you like to sort by?\n1. Last Name\n2. First Name\n3. ID Number\n4. Grade Percentage\n5. Letter Grade");
				do
				{
					while (!input.hasNextInt())
					{
						if (input.hasNext())
						{
							input.next();
						}
					}
					choice = input.nextInt();
				} while (choice < 1 || choice > 5);
			}
			Comparator<Student> comparator = null;
			switch (choice)
			{
			case 1:
				comparator = new StudentComparatorLast();
				break;
			case 2:
				comparator = new StudentComparatorFirst();
				break;
			case 3:
				comparator = new StudentComparatorID();
				break;
			case 4:
				comparator = new StudentComparatorPercentage();
				break;
			case 5:
				comparator = new StudentComparatorGrade();
			}
			if (descending)
			{
				comparator = Collections.reverseOrder(comparator);
			}
			if (choice != 7)
			{
				Collections.sort(StudentGrades, comparator);
			}
		} while (choice != 7);
		System.out.println("Bye!");
		input.close();
	}
	
	protected static ArrayList<Student> scanFile(String fileName)
	{
		File file = new File(fileName);
		Scanner input;
		try
		{
			input = new Scanner(file);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		ArrayList<Student> StudentList = new ArrayList<Student>();
		while (input.hasNextLine())
		{
			String lastName = input.next();
			String firstName = input.next();
			int idNum = input.nextInt();
			double percent = input.nextDouble();
			char[] grade = input.next().toCharArray();
			StudentList.add(new Student(lastName, firstName, idNum, percent, grade[0], (grade.length > 1) ? grade[1] : 44));
		}
		input.close();
		return StudentList;
	}
}
