
import java.util.InputMismatchException;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////


public class XYpoints
{
////////////////////////////////////////////////////////////////////////////////////////////
//Variables
   private double XY[][];
   private double XY2[][];
   int points = 1;



////////////////////////////////////////////////////////////////////////////////////////////
//Constructor


   public XYpoints()
   {
	  points = 1;
	  XY = new double[points][2];
	  XY2 = new double[points + 1][2];
   }


////////////////////////////////////////////////////////////////////////////////////////////
//Accessor


   public int getPoints()
   {
      return points;
   }



////////////////////////////////////////////////////////////////////////////////////////////
//Mutator

//   public void setSides(int theSides)
//   {
//	   Sides = theSides;
//   }



////////////////////////////////////////////////////////////////////////////////////////////
//Methods

   public void setPoints()
   {
	   double input;
	   int input2;
	   Scanner in = new Scanner(System.in);
	   int more = 0;
	   boolean check = true;
	   boolean out = true;

	   System.out.println("points = " + points);

	   System.out.println();
	   System.out.println("Please enter the (X,Y) coordinates for each of the points on your ");
	   System.out.println();


	   do{

		   XY2 = new double[points + 1][2];

		   for(int i = 0; i < points; i++){
			   for(int j = 0; j < 2; j++){
				   XY2[i][j] = XY[i][j];
			   }
		   }



		   for(int j = 0; j < 2; j++)
		   {
			   System.out.println();
			   System.out.println("Enter component:" + j);
			   System.out.println();
			   input = in.nextDouble();
			   XY2[points][j] = input;
		   }


		   points = points + 1;

		   XY = new double[points][2];


		   for(int i = 0; i < points; i++){
			   for(int j = 0; j < 2; j++){
				   XY[i][j] = XY2[i][j];
			   }
		   }

		   System.out.println("Would you like to add another point?");
		   System.out.println();
		   System.out.println("[1] Yes");
		   System.out.println("[0] No");
		   System.out.println();

		   input2 = in.nextInt();
		   more = input2;

		   do{
			   System.out.println(more);

			   if(more == 1)
			   {
				   check = false;
			   } else if (more == 0){
				   check = false;
				   out = false;
			   } else {
				   System.out.println("That was not a valid entry. Try again");
				   System.out.println("Would you like to add another point?");
				   System.out.println();
				   System.out.println("[1] Yes");
				   System.out.println("[0] No");
				   System.out.println();
				   input2 = in.nextInt();
				   more = input2;
			   }
			   	   System.out.println("points = " + points);
		   } while (check);


	   System.out.println(out);


	   } while (out);





/*
	   for(int i = 0; i < points; i++)
	   {


		   for(int j = 0; j < 2; j++)
		   {

			   System.out.println();
			   System.out.println("Enter component:" + j);
			   System.out.println();
			   input = in.nextDouble();
			   XY[i][j] = input;

		   }

		   System.out.println("Would you like to add another point?");
		   System.out.println();
		   System.out.println("[1] Yes");
		   System.out.println("[0] No");
		   System.out.println();

		   input2 = in.nextInt();
		   more = input2;

		   while(check)
		   {
			   if(more == 1)
			   {
				   points = points + 1;
				   check = false;
			   } else if (more == 0){
				   check = false;
			   } else {
				   System.out.println("That was not a valid entry. Try again");
				   System.out.println("Would you like to add another point?");
				   System.out.println();
				   System.out.println("[1] Yes");
				   System.out.println("[0] No");
				   System.out.println();
				   input2 = in.nextInt();
				   more = input2;
			   }
			   	   System.out.println("points = " + points);
		   }


	   }
*/


   }




public void getThePoints()
   {
	  System.out.println("The points are: ");
	  System.out.println();

	  System.out.println("( X  Y ):  ( ");
	  for(int i = 0; i < points; i++){
		  for(int j = 0; j < 2; j++){
			  System.out.println(XY[i][j] + "  ");
		  }

		  System.out.println(")");
		  System.out.println("( X  Y ):  ( ");
	  }

   }


}
