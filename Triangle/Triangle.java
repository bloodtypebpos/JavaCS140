/**
This class represents an Employee
*/
import java.lang.Math;


public class Triangle

{
	// variable declarations
	private double a;
	private double b;
	private double c;


//////////////////////////////////////////////////////////////////////

// Constructors

//Default constructor
public Triangle()
{
	a = 0;
	b = 0;
	c = 0;
}// end of default costructor

// Constructor
public Triangle(double aa, double bb, double cc)
{
	a = aa;
	b = bb;
	c = cc;
}// end of the constructor

//////////////////////////////////////////////////////////////////////
/*

// The following are accessor methods:

// method to get the name of the employee
public String accName()
{
	return empName;
}// end of accName


//method to get the ID of the employee
public int accID()
{
	return empID;
}//end of the accID

//method to get the pay per hour of the employee
public double accPay()
{
	return empPay;
}//end of the accPay

//method to get the hours worked by the employee
public double accHours()
{
	return empHours;
}//end of the accHours

//end of accessor methods

*/
//////////////////////////////////////////////////////////////////////
/*
//The following are mutator methods:

//method to change the name of the employee
public void mutName(String name)
{
	empName = name;
}//end of the mutName

//method to change the ID of the employee
public void mutID(int ID)
{
	empID = ID;
}//end of the mut

//method to change the pay of the employee
public void mutPay(double pay)
{
	empPay = pay;
}//end of the mutPay

//method to change the hours of the employee
public void mutHours(double hours)
{
	empHours = hours;
}//end of the mutHours

*/
//////////////////////////////////////////////////////////////////////


//The following are optional methods for the constructor

public double getPerimeter(){

	boolean bool;
	double d = 0;

	if(a < b+c && b < a+c && c < a+b){
		bool = true;
	} else {
		bool = false;
	}

	if(bool){
		d = a+b+c;
	}

	return d;

}



public double getArea(){

	boolean bool;
	double d = 0;
	double e = 0;
	double f = 0;

	if(a < b+c && b < a+c && c < a+b){
		bool = true;
	} else {
		bool = false;
	}

	if(bool){
		d = (a+b+c)*.5;
		e = d*(d-a)*(d-b)*(d-c);
		f= Math.sqrt(e);
	}

	return f;

}

//////////////////////////////////////////////////////////////////////

}// end of class Employee definition

