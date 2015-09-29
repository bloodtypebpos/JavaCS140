/**
   This program tests the Book class.
*/
public class BookTest
{
   public static void main(String[] args)
   {
      Book book1 = new Book("Cay Horstmann", "Java Concepts", 99.99, 20);
      System.out.println("The author of book1 is " + book1.getAuthor());
      System.out.println("The title of book1 is " + book1.getTitle());
      System.out.println("The price of book1 is " + book1.getPrice());

      book1.setAuthor("Herman Melville");
      book1.setTitle("Moby Dick");
      book1.setPrice(100);
      System.out.println();
      book1.discountPrice(20);
      book1.displayBook();



   }
}
