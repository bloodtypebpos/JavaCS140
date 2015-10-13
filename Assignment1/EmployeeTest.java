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

		 matt.setPay(100.50);
		 matt.setName("Idiot");
		 matt.setHours(20.5);
		 matt.setID(5);
		 matt.displayEmployee();
		 
		 


	     //Add System.exit(0); - correct end of the program
         System.exit(0);

	 }
}
