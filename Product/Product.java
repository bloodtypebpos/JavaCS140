/**
This class represents a Product
*/

public class Product

{
// Constructors

//Default constructor
public Product()
{
	name = "";
	price = 0;
}// end of default costructor

// Constructor
public Product(String aName, double money)
{
	name = aName;
	price = money;
}// end of the constructor

// method to get the name of the Product
public String getName()
{
	return name;
}// end of getName

//method to get the price of the Product
public double getPrice()
{
	return price;
}//end of the getProduct

//method to change the price of the Product
public void changePrice(double alter)
{
	price = price + alter;
}//end of the changePrice


//method to display the name and price of the Product
public void displayProduct(){
	System.out.println();
	System.out.print("The product's name is: ");
	System.out.print(name);
	System.out.print(" and the product's price is: $");
	System.out.println(price);
}//end of the displayProduct



// variable declarations
private String name;
private double price;
private double alter;

}// end of class Product definition
