import java.util.Comparator;

public class GPASorter implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			if(s1.getGpa() < s2.getGpa())
				{
					return 1;
				}
			else
				{
					return -1;
				}//gpa sort
		}
	}