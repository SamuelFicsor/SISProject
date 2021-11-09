import java.text.DecimalFormat;
public class GPACalcV2 {
//fixed GPA calculator Code
	static double firstGPA = 0;
	static double secondGPA = 0;
	static double thirdGPA = 0;
	static double cumGPA = 0;
	DecimalFormat d = new DecimalFormat("0.00");
	public static void GPACounter()
	{
		for(Student s: runSIS.listOfStudents)
		{
			switch(s.getFirstgrade())
			{
			case "A+":
			{
				firstGPA = 4.30;
				break;
			}
			case "A":
			{
				firstGPA = 4.00;
				break;
			}
			case "A-":
			{
				firstGPA = 3.70;
				break;
			}
			case "B+":
			{
				firstGPA = 3.30;
				break;
			}
			case "B":
			{
				firstGPA = 3.00;
				break;
			}
			case "B-":
			{
				firstGPA = 2.70;
				break;
			}
			case "C+":
			{
				firstGPA = 2.30;
				break;
			}
			case "C":
			{
				firstGPA = 2.00;
				break;
			}
			case "C-":
			{
				firstGPA = 1.70;
				break;
			}
			case "D+":
			{
				firstGPA = 1.30;
				break;
			}
			case "D":
			{
				firstGPA = 1.00;
				break;
			}
			case "F":
			{
				firstGPA = 0.00;
				break;
			}
			}
			
			
			switch(s.getSecondgrade())
			{
			case "A+":
			{
				secondGPA = 4.30;
				break;
			}
			case "A":
			{
				secondGPA = 4.00;
				break;
			}
			case "A-":
			{
				secondGPA = 3.70;
				break;
			}
			case "B+":
			{
				secondGPA = 3.30;
				break;
			}
			case "B":
			{
				secondGPA = 3.00;
				break;
			}
			case "B-":
			{
				secondGPA = 2.70;
				break;
			}
			case "C+":
			{
				secondGPA = 2.30;
				break;
			}
			case "C":
			{
				secondGPA = 2.00;
				break;
			}
			case "C-":
			{
				secondGPA = 1.70;
				break;
			}
			case "D+":
			{
				secondGPA = 1.30;
				break;
			}
			case "D":
			{
				secondGPA = 1.00;
				break;
			}
			case "F":
			{
				secondGPA = 0.00;
				break;
			}
			}
			
			switch(s.getThirdgrade())
			{
			case "A+":
			{
				thirdGPA = 4.30;
				break;
			}
			case "A":
			{
				thirdGPA = 4.00;
				break;
			}
			case "A-":
			{
				thirdGPA = 3.70;
				break;
			}
			case "B+":
			{
				thirdGPA = 3.30;
				break;
			}
			case "B":
			{
				thirdGPA = 3.00;
				break;
			}
			case "B-":
			{
				thirdGPA = 2.70;
				break;
			}
			case "C+":
			{
				thirdGPA = 2.30;
				break;
			}
			case "C":
			{
				thirdGPA = 2.00;
				break;
			}
			case "C-":
			{
				thirdGPA = 1.70;
				break;
			}
			case "D+":
			{
				thirdGPA = 1.30;
				break;
			}
			case "D":
			{
				thirdGPA = 1.00;
				break;
			}
			case "F":
			{
				thirdGPA = 0.00;
				break;
			}
			}
	
			cumGPA = firstGPA + secondGPA + thirdGPA;
			
			cumGPA = cumGPA/3;
			// I dont think this GPA calculator code works
	        DecimalFormat d = new DecimalFormat("0.00");

	        //System.out.println((d.format(cumGPA)));


	        s.setGpa(cumGPA);
	        
	        
	        firstGPA = 0;
			secondGPA = 0;
			thirdGPA = 0;
			cumGPA = 0;
		}
	}
}
