/**
This class represents a Employee
*/

public class Employee

{
// Constructors

//Default constructor
public Employee()
{
	name = "";
	ID = 0;
	pay = 0;
	hours = 0;
}// end of default costructor

// Constructor
public Employee(String aName, int anID, double aPay, double anHours)
{
	name = aName;
	ID = anID;
	pay = aPay;
	hours = anHours;

}// end of the constructor

// method to get the name of the Product
public String getName()
{
	return name;
}// end of getName

//method to get the price of the Product

public int getID()
{
	return ID;
}//end of the getProduct


public double getPay()
{
	return pay;
}//end of the getProduct

public double getHours()
{
	return hours;
}//end of the getProduct

//method to change the price of the Product
public void setName(String aName)
{
	name = aName;
}//end of the changePrice

//method to change the price of the Product
public void setID(int anID)
{
	ID = anID;
}//end of the changePrice

//method to change the price of the Product
public void setPay(double aPay)
{
	pay = aPay;
}//end of the changePrice

//method to change the price of the Product
public void setHours(double anHours)
{
	hours = anHours;
}//end of the changePrice


//method to display the name and price of the Product
public void displayEmployee(){
	System.out.println();
	System.out.println("The Employee's name is:   " + name);
	System.out.println("The Employee's ID is:     " + ID);
	System.out.println("The Employee's pay is:    " + pay);
	System.out.println("The Employee's hours are: " + hours);
	}//end of the displayProduct



// variable declarations
private String name;
private int ID;
private double pay;
private double hours;


}// end of class Product definition
