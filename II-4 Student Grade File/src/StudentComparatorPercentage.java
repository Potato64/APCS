import java.util.Comparator;

public class StudentComparatorPercentage implements Comparator<Student> 
{

	@Override
	public int compare(Student student1, Student student2) 
	{
		return (int)Math.ceil(student2.percent - student1.percent);
	}

}
