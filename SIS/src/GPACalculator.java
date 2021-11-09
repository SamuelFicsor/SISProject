import java.text.DecimalFormat;
public class GPACalculator
	{

		static double firstGPA = 0;
		static double secondGPA = 0;
		static double thirdGPA = 0;
		static double cumGPA = 0;
		DecimalFormat d = new DecimalFormat("0.00");
		
		//I dont think GPA calculator works
		public static void GPACounter()
		{
		
						
			for(int i = 0; i < runSIS.listOfStudents.size(); i++ )
				{
			
			
			// first class GPA
			
					if(runSIS.listOfStudents.get(i).getFirstgrade().equals("A+"))
						{
							firstGPA = firstGPA + 4.30;
						}
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("A"))
						{
							firstGPA = firstGPA + 4.00;
						}
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("A-"))
						{
							firstGPA = firstGPA + 3.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("B+"))
						{
							firstGPA = firstGPA + 3.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("B"))
						{
							firstGPA = firstGPA + 3.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("B-"))
						{
							firstGPA = firstGPA + 2.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("C+"))
						{
							firstGPA = firstGPA + 2.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("C"))
						{
							firstGPA = firstGPA + 2.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("C-"))
						{
							firstGPA = firstGPA + 1.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("D+"))
						{
							firstGPA = firstGPA + 1.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("D"))
						{
							firstGPA = firstGPA + 1.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("F"))
						{
							firstGPA = firstGPA + 0.00;
						}
					
					else
						{
							firstGPA = firstGPA + 0.00;
						}
					
			
			//second class GPA
					
					if(runSIS.listOfStudents.get(i).getSecondgrade().equals("A+"))
						{
							secondGPA = secondGPA + 4.30;
						}
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("A"))
						{
							firstGPA = firstGPA + 4.00;
						}
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("A-"))
						{
							secondGPA = secondGPA+ 3.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("B+"))
						{
							secondGPA = secondGPA + 3.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("B"))
						{
							secondGPA = secondGPA + 3.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("B-"))
						{
							secondGPA = secondGPA + 2.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("C+"))
						{
							secondGPA = secondGPA + 2.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("C"))
						{
							secondGPA = secondGPA + 2.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("C-"))
						{
							secondGPA = secondGPA + 1.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("D+"))
						{
							secondGPA = secondGPA + 1.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("D"))
						{
							secondGPA = secondGPA + 1.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("F"))
						{
							secondGPA = secondGPA + 0.00;
						}
					
					else
						{
							secondGPA = secondGPA + 0.00;
						}
					
					
			// third class GPA
					
					
					if(runSIS.listOfStudents.get(i).getThirdgrade().equals("A+")) // amount for GPA in each grade
						{
							thirdGPA = thirdGPA + 4.30;
						}
					else if(runSIS.listOfStudents.get(i).getFirstgrade().equals("A"))
						{
							firstGPA = firstGPA + 4.00;
						}
					else if(runSIS.listOfStudents.get(i).getThirdgrade().equals("A-"))
						{
							thirdGPA = thirdGPA + 3.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("B+"))
						{
							thirdGPA = thirdGPA + 3.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("B"))
						{
							thirdGPA = thirdGPA + 3.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("B-"))
						{
							thirdGPA = thirdGPA + 2.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("C+"))
						{
							thirdGPA = thirdGPA + 2.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("C"))
						{
							thirdGPA = thirdGPA + 2.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("C-"))
						{
							thirdGPA = thirdGPA + 1.70;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("D+"))
						{
							thirdGPA = thirdGPA + 1.30;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("D"))
						{
							thirdGPA = thirdGPA + 1.00;
						}
					
					else if(runSIS.listOfStudents.get(i).getSecondgrade().equals("F"))
						{
							thirdGPA = thirdGPA + 0.00;
						}
					
					else
						{
							thirdGPA = thirdGPA + 0.00;
						}
					
					cumGPA = firstGPA + secondGPA + thirdGPA; // adding together GPA of all three classes
					
			        DecimalFormat d = new DecimalFormat("0.00");
			        System.out.println((d.format(cumGPA)));
			        runSIS.listOfStudents.get(i).setGpa(cumGPA);  
			        
			        firstGPA = 0;
					secondGPA = 0;
					thirdGPA = 0;
					cumGPA = 0;
				}
					
			
			     
				
		}
		
		
		
		
		
		
	}
