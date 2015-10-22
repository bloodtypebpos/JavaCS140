//test class for GradeTest class

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;


public class GradeTest
{


	//Main method
	 public static void main ( String[] args) throws IOException
	 {
		 String input;
		 int grade;
		 BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Please provide a grade in the form of an integer from 0 to 100");
		 input = console.readLine();
		 grade = Integer.parseInt(input);
		 Grade myGrade = new Grade(grade);
		 System.out.println("The letter grade for the provided number grade is:");
		 System.out.println(myGrade.getLetterGrade());

	     //Add System.exit(0); - correct end of the program
         System.exit(0);
	 }
}
