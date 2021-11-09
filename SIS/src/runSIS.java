import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class runSIS
	{

	

		static ArrayList<Student> listOfStudents = new ArrayList<Student>();
		

		public static void main(String[] args) throws IOException
			{
				//main method takes the student text and sends it into an array list
				Scanner file = new Scanner(new File("StudentList.txt"));
				while(file.hasNext())
					{
						String tempString = file.nextLine();
						String[] filler = tempString.split(" ");

					listOfStudents.add(new Student(filler[0],filler[1],filler[2],filler[3],filler[4],filler[5],filler[6],filler[7]));
					}
				//GPACalculator.GPACounter();
					GPACalcV2.GPACounter();
					displayMenu();
    }
				
				//displayStudentList();

			
		//menu is fixed
		public static void displayMenu()
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("would you like to do?");
				System.out.println("(1) - add or delete a student");
				System.out.println("(2) - change student grades/schedule");
				System.out.println("(3) - sort students");
				System.out.println("(4) - display the students");
				System.out.println("(5) - Show the parents a GPA");
				int userChoice = userIntInput.nextInt();
				if(userChoice == 1)
					{
						//sends user to the studentAction class
						studentStatus.studentAction();
					}
				else if(userChoice == 2)
					{
						//sends user to the changing student grade and schedule class
						ChangeStudentClass.change();
					}
				else if(userChoice == 3)
					{
						//sends user to the sorting menu before asking them how they want to sort
						SortingMenu.sortingChoices();
					}
				else if(userChoice == 4)
					{
						//displays the student list
						displayStudentList();
					}
				else if(userChoice == 5)
				{
					ShowingParentsGPA.showingParents();
				}
				else
					{
						//#breakproof
						System.out.println("You must pick either 1, 2 or 3");
						displayMenu();
					}
			}

		//displayStudentList method displays students
		public static void displayStudentList()
			{
				for(int i = 0 ; i < listOfStudents.size() ; i++)
					{
						System.out.printf("%18-s", listOfStudents.get(i).getFirstname() + " " 
													+ listOfStudents.get(i).getLastname());
						System.out.printf("%2-f", listOfStudents.get(i).getGpa());
						System.out.printf("%8-s %2-s", listOfStudents.get(i).getFirstperiod() + 
													listOfStudents.get(i).getFirstgrade());
						System.out.printf("%8-s %2-s", listOfStudents.get(i).getSecondperiod() + 
													listOfStudents.get(i).getSecondgrade());
						System.out.printf("%8-s %2-s", listOfStudents.get(i).getThirdperiod() + 
													listOfStudents.get(i).getThirdgrade() + "\n");
					}
			}

	}
