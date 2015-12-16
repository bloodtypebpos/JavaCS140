
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
   String group = "";
   int theID = 0;



////////////////////////////////////////////////////////////////////////////////////////////
//Constructor


   public XYpoints(String theGroup, int anID)
   {
	  group = theGroup;
	  theID = anID;
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

   public String getGroup()
   {
      return group;
   }

   public int getID()
   {
      return theID;
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
	   System.out.println();
	   System.out.println("Please enter the (X,Y) coordinates for each of the points in your set of data ");
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
			   if(j == 0){
				   System.out.println();
				   System.out.println("Enter X component: (10 < x < 100)");
				   System.out.println();
				   input = dubIn(10,100);
				   XY2[points][j] = input;
			   } else{
				   System.out.println();
				   System.out.println("Enter Y component: (10 < x < 100)");
				   System.out.println();
				   input = dubIn(10,100);
				   XY2[points][j] = input;				   
			   }
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
		   input2 = putIn(-1,2);
		   more = input2;
		   do{
			   System.out.println(more);
			   if(more == 1)
			   {
				   check = false;
			   } else{
				   check = false;
				   out = false;
			   }
		   } while (check);
	   } while (out);
   }

public void getThePoints()
   {
	  System.out.println("There are " + (points-1) + " points, and those points are: ");
	  System.out.println();
	  System.out.println("( X  Y ): ");
	  for(int i = 1; i < points; i++){
		  System.out.print("( ");
		  for(int j = 0; j < 2; j++){
			  System.out.print(XY[i][j] + "  ");
		  }
		  System.out.println(")");
	  }
   }

public void Regression()
	{
		 double y = 0;
		 double x = 0;
		 double xx = 0;
		 double xy = 0;
		 
		 double xBar = 0;
		 double yBar = 0;
		 
		 double m = 0;
		 double b = 0;
		 double D = 0;
		 double a = 0;
		 int N = points-1;
		 
		 for(int i = 1; i < points; i++ ){
			 y = y + XY[i][1];
			 x = x + XY[i][0];
			 xx = x*x;
			 xy = XY[i][0]*XY[i][1];
		 }
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(N);
		 xBar = x/N;
		 yBar = y/N;
		 
		 x = 0;
		 y = 0;
		 xx = 0;
		 xy = 0;
		 D = 0;
		 m = 0;
		 
		 System.out.println(xBar);
		 System.out.println(yBar);
		 
		 for(int i = 1; i < points; i++ ){
			 x = XY[i][0] - xBar;
			 y = XY[i][1] - yBar;
			 xx = x*x;
			 xy = xy + xx;
			 m = m + x*y;
		 }		 
		 
		 m = m/xy;
		 b = yBar - (m*xBar);
		 
		 System.out.println("The line of best fit is: ");
		 System.out.println(" y = " + m + "*x + " + b);
		 System.out.println();
		 
		 
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

}
