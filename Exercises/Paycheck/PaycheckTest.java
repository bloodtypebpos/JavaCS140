//test class for Paycheck class


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class PaycheckTest
{

	//Main method
	 public static void main ( String[] args) throws IOException
	 {

	     // variable declarations

		 String input; // used for the input console
		 String Name;
		 double Pay;
		 double Hours;

		 // Create a BufferReader object
		 BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Employee's name:");
		 input = console.readLine();
		 Name = input;
		 System.out.println("Employee's pay per hour:");
		 input = console.readLine();
         Pay = Double.parseDouble(input);
         System.out.println("Employee's hours worked:");
		 input = console.readLine();
         Hours = Double.parseDouble(input);
		 Paycheck emp1 = new Paycheck(Name, Pay, Hours);

		 System.out.println();
		 emp1.viewEmployee();


         System.out.println();
         System.out.println(Name + "earned: " + emp1.payEmployee());



	     //Add System.exit(0); - correct end of the program
         System.exit(0);
	 }

}

