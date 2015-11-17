import java.util.InputMismatchException;
import java.util.Scanner;

/**
   This program validates input values.
*/
public class MyIntNumberTest
{
   public static void main(String[] args)
   {

		int num=0;
		int menu;
		int value;
		boolean prime;
		boolean argh = true;
		boolean blegh = true;
		boolean accmut = false;

		Scanner in = new Scanner(System.in);

		MyIntNumber myNum = new MyIntNumber();

		do {

			System.out.println("-------------- Home Menu ----------------");
			System.out.println();
			System.out.println("Select option:");
			System.out.println();
			System.out.println("[1] Calculate factorial of input natural");
			System.out.println("    number");
			System.out.println("[2] Calculate the sum of the cubes of the");
			System.out.println("    first n natural numbers");
			System.out.println("[3] Check if input value integer is prime");
			System.out.println("[4] Compute input value fibonacci number");
			if(accmut){
				System.out.println("[5] Access the value of the most recently");
				System.out.println(    "entered number");
			}
			System.out.println("[0] Exit the program");
			System.out.println();

			menu = in.nextInt();

			switch(menu)
			{
				case 1:
				System.out.println("-------------- Factorial ----------------");
				System.out.println();
				System.out.println("Enter a positive natural number in the");
				System.out.println("range of 0 and 20.");
				
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				do{
					do{
						Scanner sc = new Scanner(System.in);
						if(sc.hasNextInt()){
							num = sc.nextInt();
							blegh = false;
						} else {
							System.out.println("Invalid Entry");
						}
					}
					while(blegh);
					blegh = true;
					if(num > 0 && num < 21){
						argh = false;
					}else{
					System.out.println("Invalid entry.");
					System.out.println("Enter a positive natural number in the");
					System.out.println("range of 0 and 20.");
					num = in.nextInt();
					}
				}
				while(argh);
				argh = true;
				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////
				myNum.setN(num);
				System.out.println();

				value = myNum.nFactorial();
				System.out.println("The value of " + num + "! is: " + value);

				System.out.println();
				break;

				case 2:
				System.out.println("-------------- Cubes Sum ----------------");
				System.out.println();
				System.out.println("Enter a positive natural number in the");
				System.out.println("range of 0 and 20.");
				num = in.nextInt();
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				do{
					if(num > 0 && num < 21){
						argh = false;
					}else{
					System.out.println("Invalid entry.");
					System.out.println("Enter a positive natural number in the");
					System.out.println("range of 0 and 20.");
					num = in.nextInt();
					}
				}
				while(argh);
				argh = true;
				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////
				myNum.setN(num);
				System.out.println();

				value = myNum.nCubes();
				System.out.println("The value of " + num + " sum of cubes is: " + value);

				System.out.println();
				break;

				case 3:
				System.out.println("------------ Prime Number ---------------");
				System.out.println();
				System.out.println("Enter a positive natural number in the");
				System.out.println("range of 0 and 200.");
				num = in.nextInt();
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				do{
					if(num > 0 && num < 201){
						argh = false;
					}else{
					System.out.println("Invalid entry.");
					System.out.println("Enter a positive natural number in the");
					System.out.println("range of 0 and 200.");
					num = in.nextInt();
					}
				}
				while(argh);
				argh = true;
				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////
				myNum.setN(num);
				// System.out.println("The number you're checking is " + num + "and its root is " + myNum.getB());
				System.out.println();

				prime = myNum.nPrime();
				if(prime){
					myNum.pupuprime();
					System.out.println("As it turns out, " + num + " is prime!");
				} else {
					myNum.nunuprime();
					System.out.println("As it turns out, " + num + " is not prime. :<");
				}

				System.out.println();
				break;

				case 4:
				System.out.println("-------------- Fibonacci ----------------");
				System.out.println();
				System.out.println("Enter a positive natural number in the");
				System.out.println("range of 0 and 20.");
				num = in.nextInt();
				///////////////////////////////////////////////////////////////
				//       This runs until a valid entry is entered
				///////////////////////////////////////////////////////////////
				do{
					if(num > 0 && num < 21){
						argh = false;
					}else{
					System.out.println("Invalid entry.");
					System.out.println("Enter a positive natural number in the");
					System.out.println("range of 0 and 20.");
					num = in.nextInt();
					}
				}
				while(argh);
				argh = true;
				///////////////////////////////////////////////////////////////
				//       This is the end of the valid entry checking feature
				///////////////////////////////////////////////////////////////
				myNum.setN(num);
				System.out.println();

				value = myNum.nFibonacci();
				System.out.println("The value of the " + num + "-fib value is: " + value);

				System.out.println();
				break;
				
				case 5:
					System.out.println("-------------- Accessor -----------------");
					System.out.println();
					System.out.println("The number you recently entered is: " + myNum.getN());	
					System.out.println();
				break;
				
				case 0:
				System.out.println("---------------- Exit  ------------------");
				break;

				default: System.out.println("Sorry your choice is out of range.");


			}
			
			accmut = true;



		} while ( menu != 0 );

      System.out.println("You selected Exit ");
      System.out.println("Good Bye");
      System.exit(0);

   }
}
