//test class for Flight class


public class FlightTest
{

	//Main method
	 public static void main ( String[] args)
	 {

		 Flight flight1 = new Flight("Jet Blue", 670, "LAX", "JFK");
		 System.out.println("The flight's airline is "+ flight1.getAirline());
		 System.out.println("The flight number is = "+ flight1.getFlightNumber());
		 System.out.println("The flight's origin is = " + flight1.getOrigin());
		 System.out.println("The flight's destination is = " + flight1.getDestination());
		 System.out.println();
		 flight1.displayFlight();


}
}
