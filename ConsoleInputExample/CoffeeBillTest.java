/**
   A class to test the CoffeeBill  class.
*/

//Import library classes:

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CoffeeBillTest
{

   public static void main(String[] args) throws IOException
   {
	  String input;
      String theName;
      int theCoffee;
      int theDonuts;
      int theMuffins;

	  // Create a BufferReader object
      BufferedReader console = new BufferedReader(
         new InputStreamReader(System.in));


      System.out.println("What is your name?");
      theName = console.readLine();
      System.out.println("How many coffees did you have?");
      input = console.readLine();
      theCoffee = Integer.parseInt(input);
      System.out.println("How many donuts did you have?");
      input = console.readLine();
      theDonuts = Integer.parseInt(input);
	  System.out.println("How many muffins did you have?");
      input = console.readLine();
      theMuffins = Integer.parseInt(input);

      CoffeeBill harrysBill = new CoffeeBill(theName,theCoffee,theDonuts,theMuffins);

      System.out.println(theName + ", The amount you owe is: $" + harrysBill.calcBill());
      
      CoffeeBill JoeyJoJo = new CoffeeBill("Joe", 5, 8,0);
      JoeyJoJo.addMuffins(6);
      System.out.println("Joe's bill is: $" + JoeyJoJo.calcBill());



	//Add System.exit(0); - correct end of the program
      System.exit(0);

   }
}
