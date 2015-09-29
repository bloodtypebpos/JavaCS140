/**
This class will represents a generic Book
*/

public class Book

{

/**
construct an empty Book
*/


public Book(){

	author = "";
	title = "";
	price = 0;
	rate = 0;
}

public Book(String anAuthor, String aTitle, double aPrice, double aRate)
{
	author = anAuthor;
	title = aTitle;
	price = aPrice;
	rate = aRate;

}




public String getAuthor(){
	return author;
}

public void setAuthor(String anAuthor){
	author = anAuthor;
}

public String getTitle(){
	return title;
}

public void setTitle(String aTitle){
	title = aTitle;
}

public double getPrice(){
	return price;
}

public void setPrice(double aPrice){
	price = aPrice;
}




public void discountPrice(double aRate){

	double discount = price*aRate/100;
	double stPrice = price - discount;
	System.out.println("The new discounted price of this book is: $" + stPrice);

}

public void displayBook(){
	System.out.println("Author: " + author);
	System.out.println("Title: " + title);
	System.out.println("Price: $" + price);
	double stPrice = price - price*rate/100;
	System.out.println("Student price with discount rate of " + rate + " is = $" + stPrice);
}

	// instant fields

   private String author;
   private String title;
   private double price;
   private double rate;

}
