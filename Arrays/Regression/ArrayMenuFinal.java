import java.util.InputMismatchException;
import java.util.Scanner;

/**
   This program validates input values.
*/
public class ArrayMenuFinal
{
   public static void main(String[] args)
   {

		int num = 0;
		int menu = 0;
		boolean accmut = false;
		int count = 1;

		Scanner in = new Scanner(System.in);
		
		XYpointsTest myData = new XYpointsTest("data");
		
		System.out.println("Welcome. Thank you for using Regression Finder v1.0");
		System.out.println("Before getting started, please create a single group of points.");	
		
		addToData(myData, count);
		myData.getXYID(count).setPoints();
		count = count + 1;
				
		
		
		System.out.println("Thank you. Now, what would you like to do?");

		
		do {

			System.out.println("-------------- Home Menu ----------------");
			System.out.println();
			System.out.println("Select option:");
			System.out.println();
			System.out.println("[1] Add a new set of points");
			System.out.println("[2] Calculate the least squares");
			System.out.println("[3] View set of points by group");
			System.out.println("[0] Exit the program");
			System.out.println();

			menu = putIn(-1,6);

			switch(menu)
			{
			    
				case 1:
				System.out.println("-------------- Add Points ----------------");
				System.out.println();
				System.out.println();
				//myData.ShowXYIDs();
				addToData(myData, count);
				myData.getXYID(count).setPoints();
				count = count + 1;
				
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				num = putIn(-1,101);

				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////
				System.out.println();
				System.out.println();
				
				break;
				
				
				
				

				case 3:
				System.out.println("-------------- View Points ----------------");
				System.out.println();
				System.out.println("Enter a positive natural number in the");
				System.out.println("range of 0 and 100.");
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				myData.ShowXYIDs();
				num = putIn(0,100);
				myData.getXYID(num).getThePoints();
				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////
				System.out.println();
				System.out.println();
				break;

				case 2:
				System.out.println("------------ Regression ---------------");
				System.out.println();
				System.out.println("Please select the group of points for which");
				System.out.println("line of best fit you'd like to calculate");
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				myData.ShowXYIDs();
				num = putIn(0,100);
				myData.getXYID(num).Regression();
				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////
				System.out.println();
				System.out.println();
				break;

				case 4:
				System.out.println("-------------- Fibonacci ----------------");
				System.out.println();
				System.out.println("Enter a positive natural number in the");
				System.out.println("range of 0 and 20.");
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				num = putIn(-1,21);
				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////

				System.out.println();
				System.out.println();
				break;
				
				case 5:
					System.out.println("-------------- Accessor -----------------");
					System.out.println();	
					System.out.println();
				break;
				
				case 0:
				System.out.println("---------------- Exit  ------------------");
				break;

				default: System.out.println("Sorry your choice is out of range.");


			}
			
			accmut = true;



		} while ( menu != 0 );

      System.out.println("You selected Exit ");
      System.out.println("Good Bye");
      System.exit(0);

   }
   
   
   
   
	public static boolean isDouble(String str) {
	    try {
	        Double.parseDouble(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	public static boolean isInt(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	
	
	
	
	
	public static int putIn(int leftBound, int rightBound){
		String Ssub = "";
		int num = 0;
		boolean blegh = true;
		boolean argh = true;
		Scanner sc = new Scanner(System.in);
		do{
			do{
				Ssub = sc.nextLine();
				if(isInt(Ssub)){
					num = Integer.parseInt(Ssub);
					blegh = false;
				} else {
					System.out.println("Invalid Entry");
				}
			}
			while(blegh);
			blegh = true;
			if(num > leftBound && num < rightBound){
				argh = false;
			}else{
			System.out.println("Invalid entry.");
			System.out.println("Enter a positive natural number in the");
			System.out.println("range of 0 and 20.");
			}
		}
		while(argh);
		argh = true;	
		return num;
	}
	
	
	public static double dubIn(double leftBound, double rightBound){
		String Ssub = "";
		double num = 0;
		boolean blegh = true;
		boolean argh = true;
		Scanner sc = new Scanner(System.in);
		do{
			do{
				Ssub = sc.nextLine();
				if(isDouble(Ssub)){
					num = Double.parseDouble(Ssub);
					blegh = false;
				} else {
					System.out.println("Invalid Entry");
				}
			}
			while(blegh);
			blegh = true;
			if(num > leftBound && num < rightBound){
				argh = false;
			}else{
			System.out.println("Invalid entry.");
			System.out.println("Enter a positive natural number in the");
			System.out.println("range of 0 and 20.");
			}
		}
		while(argh);
		argh = true;	
		return num;
	}	
	

	
	public static void addToData(XYpointsTest tempPoints, int theCount)
	{
		 String theGroup;
		 int theID;
	     Scanner sc = new Scanner(System.in);		 
		 // This is the boolean to check if the value of the hours worked
		 // and the pay are both greater than 0.
		 // Create a BufferReader object
		 System.out.println("What is the Data-group's name?");
		 theGroup = sc.nextLine();
		 System.out.println("This group's ID is: " + theCount);
		 theID = theCount;

			XYpoints newPoints = new XYpoints(theGroup, theID);
		 	tempPoints.addData(newPoints);
		 	
	}
	
	public static void showGroups(int theCount, XYpointsTest tempData)
	{
		 String theGroup;
		 int theID;
	     
		 
		 System.out.println("These are the available groups to choose from:");
		 for(int i = 0; i < theCount; i++)
		 {
			 System.out.print("["  + tempData.getXYID(i).getID() + "]   " + tempData.getXYID(i).getGroup() );
		 }
		 	
	}	
/////////////////////END//////////////////////////////   
}
