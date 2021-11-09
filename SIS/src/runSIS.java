import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

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
						GPACalcV2.GPACounter(); // calling on GPA calculator
						displayMenu(); // display beginning of the program
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
					ShowingParentsGPA.showingParents(); // display to parents the GPA of their kids
				}
				else
					{
						//#breakproof
						System.out.println("You must pick either 1, 2 or 3"); // if user input is not within the bounds of options
						displayMenu(); // calling on menu again to make user input a viable option
					}
			}

		//displayStudentList method displays students
		public static void displayStudentList()

			{
				for(Student s : listOfStudents)
					{
						System.out.printf("%-8s %-12s" , s.getFirstname() , s.getLastname());
						System.out.printf("GPA: %.2f" , s.getGpa());
						System.out.printf("%-8s %-2s" , "  P1 " + s.getFirstperiod() , s.getFirstgrade());
						System.out.printf("%-8s %-2s" , " P2 " + s.getSecondperiod() , s.getSecondgrade());
						System.out.printf("%-8s %-2s" , " P3 " + s.getThirdperiod() , s.getThirdgrade() + "\n");
					} 
				
				// go back to menu option
				// I'm like that
				//this code might potentially maybe work
				
				
				System.out.println("Where do you want to go next?");
				System.out.println("(1) - Return to Main Menu");
				System.out.println("(2) - Sort by another method");
				
				Scanner supa = new Scanner(System.in);
				int supaanswer; 
				supaanswer = supa.nextInt();
				
				// Option 1
				
				if(supaanswer == 1)
					{
						System.out.println("Returning to main menu...");
						displayMenu();
					}
				
				// Option 2
				
				else if (supaanswer == 2)
					{
						System.out.println("Going back to Sorter menu");
						SortingMenu.sortingChoices();
					}
				
				// Option 3
				
				else 
					{
						System.out.println("Returning to main menu...");
						displayMenu();
					}
					
				
				
			}

	}
