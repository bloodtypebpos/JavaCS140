import java.util.InputMismatchException;
import java.util.Scanner;


public class FlightTest {

	public static void main(String[] args) {
		
		Flight test = new Flight();
		Scanner sc = new Scanner(System.in);
		String CLASS = "";
		
		boolean loop = true;
		while(loop){
		
		System.out.println("What class would you like to fly in?");
		System.out.println("[F]   First Class");
		System.out.println("[E]   Economy Class");
		
		CLASS = sc.nextLine();
		
		test.getSeat(CLASS);
		
		System.out.println("Thank you for choosing our airline. Bye!");
		
		}
	}

}
