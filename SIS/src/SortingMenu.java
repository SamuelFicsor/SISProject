import java.util.Collections;
import java.util.Scanner;

public class SortingMenu
	{
		public static void sortingChoices()
			{
				Scanner input = new Scanner(System.in);
				int inputNum;
				System.out.println("How would you like to sort the students?\n1) Name\n2) GPA\n3) Period\nAny other number) Return to the main menu");
				inputNum = input.nextInt();
				
				if(inputNum == 1)
					{
						Collections.sort(runSIS.listOfStudents, new LastNameSorter());
						runSIS.displayStudentList();
						
					}
				else if(inputNum == 2)
					{
						Collections.sort(runSIS.listOfStudents, new GPASorter());
						runSIS.displayStudentList();
					}
				else if(inputNum == 3)
					{
						Collections.sort(runSIS.listOfStudents, new PeriodSorter());
						runSIS.displayStudentList();
					}
				else
					{
						System.out.println("Returning to main menu...");
						runSIS.displayMenu();
					}
			}
	}
