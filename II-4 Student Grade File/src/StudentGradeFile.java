import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Name: Ethan Duer
Project Name: 
Filename: 
Purpose: 
Pseudocode: 
Maintenance log:
2/7/18: Project Created
*/



public class StudentGradeFile
{
	
	public static void main(String[] args) 
	{
		
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
			StudentList.add(new Student(lastName, firstName, idNum, percent, grade[0], (grade.length > 1) ? grade[1] : ' '));
		}
		input.close();
		return StudentList;
	}
}
