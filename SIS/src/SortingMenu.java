import java.util.Collections;
import java.util.Scanner;

public class SortingMenu
	{
		public static void sortingChoices()
			{
				Scanner input = new Scanner(System.in);
				int inputNum;
				System.out.println("How would you like to sort the students?\n"
						+ "1) Name\n"
						+ "2) GPA\n"
						+ "3) Period\n"
						+ "Any other number will return to the main menu");
				inputNum = input.nextInt();
				
				if(inputNum == 1)
					{
						Collections.sort(runSIS.listOfStudents, new LastNameSorter());
						runSIS.displayStudentList();
						runSIS.displayMenu();
					}
				else if(inputNum == 2)
					{
						Collections.sort(runSIS.listOfStudents, new GPASorter());
						runSIS.displayStudentList();
						runSIS.displayMenu();
					}
				else if(inputNum == 3)
					{
						Collections.sort(runSIS.listOfStudents, new PeriodSorter());
						runSIS.displayStudentList();
						runSIS.displayMenu();
					}
				else
					{
						System.out.println("Returning to main menu...");
						runSIS.displayStudentList();
						runSIS.displayMenu();
					}
			}
	}
