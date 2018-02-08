
public class Student
{
	public String lastName;
	public String firstName;
	public int idNum;
	public double percent;
	public char grade;
	public char suffix;
	
	public Student(String lastName, String firstName, int idNum, double percent, char grade, char suffix)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.idNum = idNum;
		this.percent = percent;
		this.grade = grade;
		this.suffix = suffix;
	}
	
	@Override
	public String toString()
	{
		return lastName + "\t" + firstName + "\t" + String.format("%06d", idNum) + "\t" + percent + "\t" + grade + ((suffix != 44) ? suffix : "");
	}
}