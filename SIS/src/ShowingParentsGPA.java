import java.util.Scanner;
import java.text.DecimalFormat;
public class ShowingParentsGPA {
	 
    // System.out.println((d.format(cumGPA)));
	public static void showingParents()
	{
		DecimalFormat d = new DecimalFormat("0.00");
		Scanner userIntInput = new Scanner(System.in);
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("These are the current students");
		for(int i = 0; i < runSIS.listOfStudents.size(); i++)
			{
				//prints out student list
				System.out.println("(" + (i + 1) + ") " + runSIS.listOfStudents.get(i).getLastname() + ", " + runSIS.listOfStudents.get(i).getFirstname());
			}
		System.out.println("Which students GPA do you want to see");
		int studentChoice = userIntInput.nextInt();
	//gets the student and then adds to the GPA 
			System.out.print("Mr and Mrs " + runSIS.listOfStudents.get(studentChoice - 1).getLastname() + ", " + runSIS.listOfStudents.get(studentChoice - 1).getFirstname() + "'s GPA is: ");
			if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() == 4.00)
			{
				System.out.print((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa())));
				System.out.println();
			}
			
			else if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() <= 3.50)
			{
				System.out.println((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa() + .5)));
			}
			
			else if(runSIS.listOfStudents.get(studentChoice - 1).getGpa() <= 3.00)
			{
				System.out.print((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa() + 1)));
				System.out.println();
			}
			
			else
			{
				System.out.println((d.format(runSIS.listOfStudents.get(studentChoice - 1).getGpa())));
			}
			
		}

	
			
}
