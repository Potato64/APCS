import java.util.Comparator;

public class StudentComparatorLast implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) 
	{
		return student1.lastName.compareTo(student2.lastName);
	}

}
