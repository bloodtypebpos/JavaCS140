//test class for Triangle class


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class TriangleTest
{

	//Main method
	 public static void main ( String[] args) throws IOException
	 {

	     // variable declarations

		 String input; // used for the input console
		 double A;
		 double B;
		 double C;

		 // Create a BufferReader object
		 BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Side A:");
		 input = console.readLine();
         A = Double.parseDouble(input);
		 System.out.println("Side B:");
		 input = console.readLine();
         B = Double.parseDouble(input);
		 System.out.println("Side C:");
		 input = console.readLine();
         C = Double.parseDouble(input);

         Triangle tri = new Triangle(A,B,C);


		 System.out.println("The Triangle's perimeter is:" + tri.getPerimeter());
         System.out.println();
         System.out.println("The Triangle's area is:" + tri.getArea());


	     //Add System.exit(0); - correct end of the program
         System.exit(0);
	 }

}

