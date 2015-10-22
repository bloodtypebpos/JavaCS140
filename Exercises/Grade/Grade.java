/**
This class represents a grade
*/

public class Grade

{
// Constructors

//Default constructor
public Grade()
{
	grade = 0;

}// end of default costructor

// Constructor
public Grade(int aGrade)
{
	grade = aGrade;
}// end of the constructor

// method to get the grade
public int getGrade()
{
	return grade;
}// end of getName

//method to get yhe salary of the Employee
public String getLetterGrade()
{
	String letterGrade = "";

	if(grade >= 0 && grade <= 100){
		if(grade >= 80){
			letterGrade = "A";
		}else if(grade >= 70){
			letterGrade = "B";
		}else if(grade >= 60){
			letterGrade = "C";
		}else if(grade >= 50){
			letterGrade = "D";
		}else{
			letterGrade = "F";
		}
	}else{
		letterGrade = "Invalid grade entry. Make sure the grade is between 0 and 100";
	}

	return letterGrade;

}//end of the getLetterGrade

// variable declarations
private int grade;

}// end of class Grade definition
