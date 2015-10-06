/**
   A class to test the Cone class.
*/
public class ConeTest
{
   /**
      Tests the methods of the Cone class.
   */
   public static void main(String[] args)
   {
      Cone aCone = new Cone(1,1);
      System.out.println(aCone.Base());
      System.out.println(aCone.Curc());
      System.out.println(aCone.Volume());
      System.out.println(aCone.LatSurf());
      System.out.println();
      System.out.println(aCone.getRadius());
      System.out.println(aCone.getHeight());

      aCone.setRadius(2);
      aCone.setHeight(3);

      System.out.println(aCone.Base());
      System.out.println(aCone.Curc());
      System.out.println(aCone.Volume());
      System.out.println(aCone.LatSurf());
      System.out.println();
      System.out.println(aCone.getRadius());
      System.out.println(aCone.getHeight());

   }
}
