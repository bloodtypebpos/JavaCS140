/**
This class represents an Employee
*/


public class Employee

{
	// variable declarations
	private String empName;
	private int empID;
	private double empPay;
    private double empHours;


//////////////////////////////////////////////////////////////////////

// Constructors

//Default constructor
public Employee()
{
	empName = "";
	empID = 0;
	empPay = 0;
	empHours = 0;
}// end of default costructor

// Constructor
public Employee(String name, int ID, double pay, double hours)
{
	empName = name;
	empID = ID;
	empPay = pay;
	empHours = hours;

}// end of the constructor

//////////////////////////////////////////////////////////////////////


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


//////////////////////////////////////////////////////////////////////

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


//////////////////////////////////////////////////////////////////////


//The following are optional methods for the constructor

//method to view the name, ID, pay and hours of the employee
public void viewEmployee(){
	System.out.println("employee's name is " + empName);
	System.out.println("employee's ID is " + empID);
	System.out.println("employee's pay per hour is " + empPay);
	System.out.println("employee's hours worked are " + empHours);
	}//end of the viewEmployee

//method to obtain the gross pay, withholding tax and net pay of the employee
public void payEmployee(){

	double tax;
	double gp;
	double net;
	gp = empHours*empPay;
	if (gp >= 500.01){
		tax = 0.2;
	}else if (gp >= 400.01){
		tax = 0.15;
	}else if (gp >= 300.01){
		tax = 0.12;
	}else {
		tax = 0.1;
	}
	net = gp - (gp*tax);
	System.out.println();
	System.out.println("employee's gross pay is " + gp);
	System.out.println("eployee's withholding % is " + 100*tax + "%");
	System.out.println("employee's net pay is " + net);
    }//end of the viewEmployee


//////////////////////////////////////////////////////////////////////

}// end of class Employee definition

