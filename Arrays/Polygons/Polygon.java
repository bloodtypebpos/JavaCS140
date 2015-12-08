

import java.util.InputMismatchException;
import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////////


public class Polygon
{
////////////////////////////////////////////////////////////////////////////////////////////
//Variables

   private int Sides;
   private int m = 0;
   private int n = 0;
   private double X[];
   private double Y[];




////////////////////////////////////////////////////////////////////////////////////////////
//Constructor


   public Polygon(int theSides)
   {
      Sides = theSides;
	  X = new double[Sides];
   	  Y = new double[Sides];
   }


////////////////////////////////////////////////////////////////////////////////////////////
//Accessor


   public int getSides()
   {
      return Sides;
   }

   public int getM()
   {
      return m;
   }

   public int getN()
   {
      return n;
   }

////////////////////////////////////////////////////////////////////////////////////////////
//Mutator

   public void setSides(int theSides)
   {
	   Sides = theSides;
   }

   public void setM(int theM)
   {
	   m = theM;
   }

   public void setN(int theN)
   {
	   n = theN;
   }

////////////////////////////////////////////////////////////////////////////////////////////
//Methods

   public void setPoints()
   {
	   //double X[] = new double[Sides];
       //double Y[] = new double[Sides];

	   double input;
	   Scanner in = new Scanner(System.in);

	   System.out.println();
	   System.out.println("Please enter the (X,Y) coordinates for each of the points on your " + Sides + "-sided polygon:");
	   System.out.println();

	   for(int i = 0; i < Sides; i++)
	   {
		   for(int j = 0; j < 2; j++)
		   {
			   if(j == 0)
			   {
				   System.out.println();
				   System.out.println("Enter X component:");
				   System.out.println();
				   input = in.nextDouble();
				   X[i] = input;
			   }
			   else
			   {
				   System.out.println();
				   System.out.println("Enter Y component:");
				   System.out.println();
				   input = in.nextDouble();
				   Y[i] = input;
			   }
		   }
	   }



   }

//(x0y1+x1y2+ .. +xn-1y0) - (y0x1+y1x2+..+yn-1x0)

   public void getArea()
   {
	   	   double pos = 0;
	   	   double neg = 0;
	   	   double val = 0;
	   	   double total = 0;
	   	   int off = Sides-1;

	   	   for(int i = 0; i < Sides; i++)
	   	   {
	   		   if( i == (Sides - 1))
	   		   {
	   			   pos = X[i] * Y[0];
	   			   neg = Y[i] * X[0];
	   			   val = pos - neg;
	   			   total = total + val;
	   		   }
	   		   else
	   		   {
	   		       pos = X[i] * Y[i+1];
	   		       neg = Y[i] * X[i+1];
	   		       val = pos - neg;
	   		       total = total + val;
	   		   }

	   	   }

	   	   total = total*0.5;
	   	   total = Math.abs(total);


	   System.out.println("The area is: " + total);

   }




}
