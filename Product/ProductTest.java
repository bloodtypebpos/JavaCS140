//test class for Product class


public class ProductTest
{

	//Main method
	 public static void main ( String[] args)
	 {



		 Product item1 = new Product("Football", 200);
		 System.out.println("The first product is "+ item1.getName());
		 System.out.println("The first product's price is = "+ item1.getPrice());
		 item1.changePrice(5);
		 System.out.println("The first product's new price is = " + item1.getPrice());
		 System.out.println();
		 item1.displayProduct();

		 System.out.println();
		 Product item2 = new Product("Soccer Ball", 300);
		 System.out.println("The first product is "+ item2.getName());
		 System.out.println("The first product's price is = "+ item2.getPrice());
		 item2.changePrice(5);
		 System.out.println("The first product's new price is = " + item2.getPrice());
		 System.out.println();
		 item2.displayProduct();

		 System.out.println();
		 Product item3 = new Product("Baseball", 100);
		 System.out.println("The first product is "+ item3.getName());
		 System.out.println("The first product's price is = "+ item3.getPrice());
		 item3.changePrice(5);
		 System.out.println("The first product's new price is = " + item3.getPrice());
		 System.out.println();
		 item3.displayProduct();

}
}
