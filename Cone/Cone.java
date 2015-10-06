/**
   A Cone has a radius and height that can be changed by
   set methods, got by get methods and calculation methods
   to include the base, circumferance, volume and lat surface.
*/

   /**
      Import the Math class
   */
import java.lang.Math;


   /**
      Creates the Cone Class
   */
public class Cone
{

   /**
      Constructs a Cone with a 0 for both radius and height
   */
   public Cone()
   {
       r =0;
       h = 0;
   }

   /**
      Constructs a Cone with a given radius and height
   */
   public Cone(double rr, double hh)
   {
      r= rr;
      h = hh;
   }

   /**
      Calculates the base of a given cone
   */
   public double Base()
   {

      return 3.14*r*r;
   }

  /**
      Calculates the circumference of a given cone
   */
   public double Curc()
   {

      return 2*3.14*r;
   }
  /**
      Calculates the volume of a given cone
   */
   public double Volume()
   {

      return (3.14*r*4*h)/3;
   }

  /**
      Calculates the lateral surface of a given cone
   */
   public double LatSurf()
   {
	   double j = r*r + h*h;
	  double k = Math.sqrt(j);
      return (3.14*r)*k;
   }

  /**
      Sets the value of the radius of a given cone
   */
   public void setRadius(double aRadius)
   {
	   r = aRadius;
   }
  /**
      Sets the value of the height of a given cone
   */
   public void setHeight(double aHeight)
   {
   	   h = aHeight;
   }
  /**
      Gets the value of the radius of a given cone
   */
   public double getRadius()
   {
   	   return r;
   }
  /**
      Gets the value of the radius of a given cone
   */
   public double getHeight()
   {
   	   return h;
   }

   private double r;
   private double h;
}
