/**
This class represents a flight
*/

public class Flight

{
// Constructors

//Default constructor
public Flight()
{
	airline = "";
	flightNumber = 0;
	origin = "";
	destination = "";
}// end of default costructor

// Constructor
public Flight(String anAirline, int whichFlight, String anOrigin, String aDestination)
{
	airline = anAirline;
	flightNumber = whichFlight;
	origin = anOrigin;
	destination = aDestination;

}// end of the constructor

// method to get the name of the airline
public String getAirline()
{
	return airline;
}// end of getAirline

//method to get the flight number for the flight
public int getFlightNumber()
{
	return flightNumber;
}//end of the getFlightNumber

//method to get the flight origin for the flight
public String getOrigin()
{
	return origin;
}//end of the getOrigin

//method to get the flight destination for the flight
public String getDestination()
{
	return destination;
}//end of the getDestination


//method to get the flight information for the flight
public void displayFlight(){
	System.out.println();
	System.out.println("The flight's airline is: ");
	System.out.println(airline);
	System.out.println("The flight number is: ");
	System.out.println(flightNumber);
	System.out.println("The flight's origin is: ");
	System.out.println(origin);
	System.out.println("The flight's destination is: ");
	System.out.println(destination);
}//end of the displayFlight



// variable declarations
private String airline;
private String origin;
private String destination;
private int flightNumber;

}// end of class Flight definition
