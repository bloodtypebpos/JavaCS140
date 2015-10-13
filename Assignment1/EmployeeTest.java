//test class for Product class


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class EmployeeTest
{

	//Main method
	 public static void main ( String[] args) throws IOException
	 {
		 String input;

		 String theName;
		 int theID;
		 double thePay;
		 double theHours;

		 // Create a BufferReader object
		 BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("What is the Employee's name?");
		 theName = console.readLine();
		 System.out.println("What is the Employee's ID?");
		 input = console.readLine();
		 theID = Integer.parseInt(input);
		 System.out.println("What is the Employee's pay?");
		 input = console.readLine();
         thePay = Double.parseDouble(input);
         System.out.println("How many hours did the Employee work?");
		 input = console.readLine();
         theHours = Double.parseDouble(input);
		 Employee matt = new Employee(theName, theID, thePay, theHours);

		 matt.displayEmployee();
		 
		 
		 matt.setPay(10);
		 matt.setName("Matt Tigrett");
		 matt.setHours(40);
		 matt.setID(5);
		 
		 
		 matt.displayEmployee();

		System.out.println();
		System.out.println("The Employee's name is:   " +  matt.getName());
		System.out.println();
		System.out.println();
		System.out.println("The Employee's ID is:   " +  matt.getID());
		System.out.println();
		System.out.println();
		System.out.println("The Employee's pay is:   " +  matt.getPay());
		System.out.println();
		System.out.println();
		System.out.println("The Employee's hours are:   " +  matt.getHours());
		System.out.println();


		matt.getPaid();





	     //Add System.exit(0); - correct end of the program
         System.exit(0);

	 }

}
