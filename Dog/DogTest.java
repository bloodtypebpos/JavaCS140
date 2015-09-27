//test class for Dog class


public class DogTest
{

	//Main method
	 public static void main ( String[] args)
	 {

		 System.out.println();
		 Dog dog1 = new Dog("Sammy", 5);
		 System.out.println("The Dog's name is "+ dog1.getName());
		 System.out.println("The Dog's age is "+ dog1.getAge());
		 dog1.ageConvert();
		 System.out.println();
		 dog1.displayDog();

}
}
