/**
This class represents a Paycheck
*/


public class Paycheck

{
	// variable declarations
	private String empName;
	private double empPay;
    private double empHours;


//////////////////////////////////////////////////////////////////////

// Constructors

//Default constructor
public Paycheck()
{
	empName = "";
	empPay = 0;
	empHours = 0;
}// end of default costructor

// Constructor
public Paycheck(String name, double pay, double hours)
{
	empName = name;
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
	System.out.println("employee's pay per hour is " + empPay);
	System.out.println("employee's hours worked are " + empHours);
	}//end of the viewEmployee

//method to obtain the gross pay, withholding tax and net pay of the employee
public double payEmployee(){

	double check=0;
	double overtime=0;

	if (empHours>40){
		overtime = empHours - 40;
		check = 40*empPay + overtime*empPay*1.5;
	} else {
		check = empPay*empHours;
	}

	return check;

  }//end of the payEmployee


//////////////////////////////////////////////////////////////////////

}// end of class Paycheck definition

