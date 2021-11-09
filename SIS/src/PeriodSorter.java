import java.util.Comparator;

public class PeriodSorter implements Comparator<Student>
	{
		public int compare(Student s1, Student s2)
		{
			return s1.getFirstperiod().compareTo(s2.getFirstperiod()); // establishing relationship between different periods, sorts them accordingly
		}
	}