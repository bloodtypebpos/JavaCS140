import java.util.InputMismatchException;
import java.util.Scanner;

public class Flight {

	/////////////////////  VARIABLES ///////////////////////////////
	
	private int fclass = 5;
	private int eclass = 15;
	private int seats = fclass + eclass;
	Scanner sc = new Scanner(System.in);
	
	   private int flight[];
	   private int taken[];
	
	/////////////////////  CONSTRUCTOR ///////////////////////////////
		
	   public Flight()
	   {
		  flight = new int[seats];
	   	  taken = new int[seats];
	   	  
	   	  for(int i = 0; i < seats; i++){
	   		  flight[i] = i;
	   		  taken[i] = 0;
	   	  }
	   }
	

	/////////////////////  ACCESSORS ///////////////////////////////
	

	/////////////////////  MUTATORS ///////////////////////////////
	

	/////////////////////  METHODS ///////////////////////////////
	
	public void getSeat(String CLASS){
		
		int num = 0;
		int chairs = 0;
		boolean switchIt = false;
		
		if(CLASS.equals("F")){
			System.out.println("You chose first class");
			switchIt = true;
		} else if (CLASS.equals("E")){
			System.out.println("You chose economy class");
			switchIt = false;
		}
		
		
		if(switchIt){
			for(int i = 0; i < fclass; i++){
				chairs = chairs + taken[i];
			}
			chairs = fclass - chairs;
			System.out.println("There was " + chairs + " first class seats left!");
			
			if(chairs > 0){
				num = chairs - 1;
				taken[num] = 1;
				System.out.println("Your seat number is: " + (fclass - num));
			}else{
				System.out.println("I'm sorry. There are no available seats in this section");
			}
			
		} else {
			for(int i = 5; i < seats; i++){
				chairs = chairs + taken[i];
			}
			chairs = eclass - chairs;
			System.out.println("There was " + chairs + " economy seats left!");
			
			if(chairs > 0){
				num = chairs + 4;
				taken[num] = 1;
				System.out.println("Your seat number is: " + "...THE NUM IS " + num + "             " + ((eclass - num)+10));
			}else{
				System.out.println("I'm sorry. There are no available seats in this section");
			}
		}
		
	}
	
	
	
	
	
	
	

	/////////////////////////  END    ///////////////////////////////
}
