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
}

public Book(String anAuthor, String aTitle, double aPrice)
{
	author = anAuthor;
	title = aTitle;
	price = aPrice;

}




public String getAuthor(){
	return author;
}

public String getTitle(){
	return title;
}


public double getPrice(){
	return price;
}


public void displayBook(){
	System.out.println("Author: " + author);
	System.out.println("Title: " + title);
	System.out.println("Price: $" + price);
}

public void discountPrice(double discount){

	price = price*(1 - discount);
	System.out.println("The new discounted price of this book is: $" + price);

}

	// instant fields

   private String author;
   private String title;
   private double price;

}
