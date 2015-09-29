/**
   This program tests the Book class.
*/
public class BookTest
{
   public static void main(String[] args)
   {
      Book book1 = new Book("Herman Melville", "Mobby Dick", 34.56);
      System.out.println("The author of book1 is " + book1.getAuthor());
      System.out.println("The title of book1 is " + book1.getTitle());
      System.out.println("The price of book1 is " + book1.getPrice());
      System.out.println();
      book1.discountPrice(0.10);
      book1.displayBook();



   }
}
