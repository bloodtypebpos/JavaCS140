/**
   A Coffee shop bill will be calculated and printed.
*/
public class CoffeeBill
{
   /**
      Constructs an empty bill for a customer
      @param aName custoner name
   */
   public CoffeeBill(String aName)
   {
      customerName = aName;
      coffees = 0;
      donuts = 0;
      muffins = 0;
   }
   
   public example(String aWord, int aNUM, double aDubl)
   {
	   num1 = aDubl;
	   num2 = aNum;
	   word = aWord;
	   
   }

 /**
      Constructs a bill for a customer
      @param aName custoner name
      @param coff number of coffees
      @param don number of donuts
      @param muff number of muffins
   */
   public CoffeeBill(String aName, int coff, int don, int muff)
   {
      customerName = aName;
      coffees = coff;
      donuts = don;
      muffins = muff;
   }


   /**
      Add coffees to the bill.
      @param coff the number of coffees to be added
   */
   public void addCoffees(int coff)
   {
      int  newCoffees = coffees + coff;
      coffees = newCoffees;
   }

 /**
      Add muffins to the bill.
      @param muff the number of muffins to be added
   */
   public void addMuffins(int muff)
   {

      muffins = muffins + muff;
   }

    /**
         Add donuts to the bill.
         @param don the number of donuts to be added
      */
      public void addDonuts(int don)
      {
         donuts = donuts + don;
   }

   /**
      Calculate bill
      @return finalBill

   */
   public double calcBill()
   {
	   //calculations
      double bill = coffees*COFFEE_PRICE + donuts*DONUT_PRICE + muffins*MUFFIN_PRICE;
      double tax = bill*TAX_RATE;
      double finalBill = bill + tax;
      return finalBill;
   }

   /**
      Gets the customer name.
      @return customer name
   */
   public String getName()
   {
      return customerName;
   }

   /**
   Display bill
   */
   public void displayBill()
   {
	   double fBill = calcBill();
	   System.out.println("Hello, " + customerName);
	   System.out.println("Your bill is = " +  fBill);
	   System.out.println("Have a nice day!");

   }
// instant fields and constants

  private static final double COFFEE_PRICE = 1.25;
  private static final double DONUT_PRICE = 0.75;
  private static final double MUFFIN_PRICE = 1.50;
  private static final double TAX_RATE = 0.06;

     private int coffees;
     private int donuts;
     private int muffins;
     private String customerName;

}
