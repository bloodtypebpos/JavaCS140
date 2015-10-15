//test class for Employee class


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class EmployeeTest
{

	//Main method
	 public static void main ( String[] args) throws IOException
	 {

	     // variable declarations

		 String input; // used for the input console
		 String Name;
		 int ID;
		 double Pay;
		 double Hours;

		 // Create a BufferReader object
		 BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Employee's name:");
		 input = console.readLine();
		 Name = input;
		 System.out.println("Employee's ID:");
		 input = console.readLine();
		 ID = Integer.parseInt(input);
		 System.out.println("Employee's pay per hour:");
		 input = console.readLine();
         Pay = Double.parseDouble(input);
         System.out.println("Employee's hours worked:");
		 input = console.readLine();
         Hours = Double.parseDouble(input);
		 Employee emp1 = new Employee(Name, ID, Pay, Hours);

		 System.out.println();
		 emp1.viewEmployee();

		 emp1.payEmployee();

		 System.out.println();
		 emp1.mutPay(15);
		 emp1.mutName("Joe Smith");
		 emp1.mutHours(30);
		 emp1.mutID(123);

		 emp1.viewEmployee();

		 System.out.println();
		 System.out.println("Employee's name: " +  emp1.accName());
		 System.out.println();
		 System.out.println("Employee's ID is: " +  emp1.accID());
		 System.out.println();
		 System.out.println("Employee's pay per hour is: " +  emp1.accPay());
		 System.out.println();
		 System.out.println("Employee's hours worked are: " +  emp1.accHours());

	     //Add System.exit(0); - correct end of the program
         System.exit(0);

	 }

}

