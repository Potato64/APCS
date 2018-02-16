import java.util.Comparator;

public class StudentComparatorGrade implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) 
	{
		return (student1.grade - student2.grade == 0) ? student1.suffix - student2.suffix : student1.grade - student2.grade;
	}

}
