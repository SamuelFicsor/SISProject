import java.util.Scanner;

public class ChangeStudentClass
	{
		
		public static void change()
		{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			//displays students
			System.out.println("These are the current students");
			for(int i = 0; i < runSIS.listOfStudents.size(); i++)
				{
					System.out.println("(" + (i + 1) + ") " + runSIS.listOfStudents.get(i).getLastname() + ", " + runSIS.listOfStudents.get(i).getFirstname());
				}
			System.out.println("Do you want to change a class or a grade");
			System.out.println("(1) - Class");
			System.out.println("(2) - Grade");
			int decision = userIntInput.nextInt();
			
		if(decision == 1) //changing the grade code
				{
					System.out.println("What student do you want to change?");
					int studentChoice = userIntInput.nextInt();
					System.out.println("Which period do you want to change?");
					System.out.println("(1) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod());
					System.out.println("(2) - " + runSIS.listOfStudents.get(studentChoice - 1).getSecondperiod());
					System.out.println("(3) - " + runSIS.listOfStudents.get(studentChoice - 1).getThirdperiod());
					int periodChoice = userIntInput.nextInt();
			
			if(periodChoice == 1)
				{
					//finds out what they want to change the class to
					System.out.println("What do you want to change this class to?");
					System.out.println("(1) - Biology");
					System.out.println("(2) - Algebra");
					System.out.println("(3) - English");
					int changeClass = userIntInput.nextInt();
					if(changeClass == 1)
						{
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod("Biology");
							System.out.println("That class has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}
							
						}
					else if(changeClass == 2)
						{
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod("Algebra");
							System.out.println("That class has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}
						}
					else if(changeClass == 3)
						{
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod("English");
							System.out.println("That class has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}
						}
				}
			else if(periodChoice == 2)
				{
					System.out.println("What do you want to change this class to?");
					System.out.println("(1) - Biology");
					System.out.println("(2) - Algebra");
					System.out.println("(3) - English");
					int changeClass = userStringInput.nextInt();
					if(changeClass == 1)
						{
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod("Biology");
							System.out.println("That class has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}
							
						}
					else if(changeClass == 2)
						{
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod("Algebra");
							System.out.println("That class has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}
						}
					else if(changeClass == 3)
						{
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod("English");
							System.out.println("That class has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}
						}
					else
						{
							System.out.println("You need to pick either 1, 2, or 3");
							change();
						}
					

				}
			else if(periodChoice == 3)
				{
					System.out.println("What do you want to change this class to?");
					String changeClass = userStringInput.nextLine();
					runSIS.listOfStudents.get(studentChoice - 1).setThirdperiod(changeClass);

				}
			
				}
		else if(decision == 2)
				{
					System.out.println("What student do you want to change?");
					int studentChoice = userIntInput.nextInt();
					System.out.println("Which period do you want to change?");
					System.out.println("(1) - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstperiod() + " - " + runSIS.listOfStudents.get(studentChoice - 1).getFirstgrade());
					System.out.println("(2) - " + runSIS.listOfStudents.get(studentChoice - 1).getSecondperiod() + " - " + runSIS.listOfStudents.get(studentChoice - 1).getSecondgrade());
					System.out.println("(3) - " + runSIS.listOfStudents.get(studentChoice - 1).getThirdperiod() + " - " + runSIS.listOfStudents.get(studentChoice - 1).getThirdgrade());
					int periodChoice = userIntInput.nextInt();
					
					if(periodChoice == 1)
						{
							System.out.println("What do you want to change this grade to?");
							String changeGrade = userStringInput.nextLine();
							runSIS.listOfStudents.get(studentChoice - 1).setFirstperiod(changeGrade);
							System.out.println("That grade has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}
						}
					else if(periodChoice == 2)
						{
							System.out.println("What do you want to change this grade to?");
							String changeGrade = userStringInput.nextLine();
							runSIS.listOfStudents.get(studentChoice - 1).setSecondperiod(changeGrade);
							System.out.println("That grade has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}

						}
					else if(periodChoice == 3)
						{
							System.out.println("What do you want to change this grade to?");
							String changeGrade = userStringInput.nextLine();
							runSIS.listOfStudents.get(studentChoice - 1).setThirdperiod(changeGrade);
							System.out.println("That grade has been changed");
							System.out.println("Where do you want to go next");
							System.out.println("(1) - Return to Main Menu");
							System.out.println("(2) - Change Another Student");
							int moveDecision = userStringInput.nextInt();
							if(moveDecision == 1)
								{
									runSIS.displayMenu();
								}
							else if(moveDecision == 2)
								{
									change();
								}

						}
				}
		else
			{
				System.out.println("You must either pick 1 or 2");
				change();
			}
			
		}
	}
