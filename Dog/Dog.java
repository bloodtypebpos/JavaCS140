/**
This class represents a dog
*/

public class Dog

{
// Constructors

//Default constructor
public Dog()
{
	name = "";
	age = 0;
}// end of default costructor

// Constructor
public Dog(String aName, double anAge)
{
	name = aName;
	age = anAge;
}// end of the constructor

// method to get the name of the dog
public String getName()
{
	return name;
}// end of getName

//method to get the age of the dog
public double getAge()
{
	return age;
}//end of the getAge

//method to get the age of the dog in human years
public void ageConvert()
{
	System.out.println("In human years, the Dog's age is " + (age*7));
}//end of the ageConvert

//method to display the name and age of the dog in both its and human years
public void displayDog(){
	System.out.println();
	System.out.print("The Dog's name is: ");
	System.out.print(name);
	System.out.print(" and the Dog's age is: ");
	System.out.println(age);
    System.out.println("In human years, the Dog's age is: " + (age*7));
}//end of the displayDog


// variable declarations
private String name;
private double age;

}// end of class Dog definition
