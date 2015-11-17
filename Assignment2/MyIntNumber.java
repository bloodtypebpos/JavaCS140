/**
This class represents a... number I guess...
*/
import java.lang.Math;


public class MyIntNumber

{
	// variable declarations
	private int n;


//////////////////////////////////////////////////////////////////////

// Constructors

//Default constructor
public MyIntNumber()
{
	n = 0;
}// end of default costructor

// Constructor
public MyIntNumber(int nn)
{
	n = nn;
}// end of the constructor




//The following are accessory methods

public int getN(){
	return n;
}


public int getB(){
	int b = (int) Math.sqrt(n) + 1;
	return b;
}

//////////////////////////////////////////////////////////////////////

//The following are mutator methods

public void setN(int nn){
	n = nn;
}



//////////////////////////////////////////////////////////////////////

//The following are function methods

public int nFactorial(){
	int a = 1;
	for (int i = n; i > 0; i--){
		a = a*i;
	}
	return a;
}

public int nCubes(){
	int a = 0;
	for (int i = n; i > 0; i--){
		a = a + (i*i*i);
	}
	return a;
}

public boolean nPrime(){
	boolean a = true;
	boolean c = true;
	int b = (int) Math.sqrt(n) + 1;

	while( c ){
			if(n <= 12){
				if(n == 2 || n == 3 || n == 5 || n == 7 || n == 11){
					a = true;
					c = false;
				} else {
					a = false;
					c = false;
				}

			} else {
			for(int i = 2; i < b; i++){
				if(n%i == 0){
					c = false;
					a = false;
				} else {
					c = false;
				}
			}
		}
	}

	return a;
}



public int nFibonacci(){
	int a = 0;
	int b = 1;
	int c = 0;
	double d=0;
	double ratio = 1.61803398875;

	if(n <= 3){
		if(n == 1){
			a = 1;
		}else if(n == 2){
			a = 1;
		}else if(n == 3){
			a = 2;
		}
	} else {
			n = n-2;
			for (int i = 0; i <= n; i++){
			a = b + c;
			c = b;
			b = a;
			d = (double) a/c ;
		}
	}



	System.out.println();
	System.out.println(d);
	System.out.println();
	System.out.println();
	System.out.println(((d-ratio)/ratio)*100 + "% error");
	System.out.println();

	return a;
}


public void pupuprime(){
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@                                             @@");
	System.out.println("@@                                             @@");
	System.out.println("@@      @@@@@ @@@@@  @@ @@@ `@@@ @@@@ @@       @@");
	System.out.println("@@      @@@@@`@@@@@; @@ @@@,;@@@ @@@@ @@       @@");
	System.out.println("@@      @@+ @,@@  @@ @@ @@@@@@@@ @@   @@       @@");
	System.out.println("@@      @@+ @,@@ @@; @@ @@+@@+@@ @@   @@       @@");
	System.out.println("@@      @@@@@`@@@@:  @@ @@,@@,@@ @@@@ @@       @@");
	System.out.println("@@      @@@@, @@ @@' @@ @@.@@,@@ @@   @@       @@");
	System.out.println("@@      @@    @@  @@ @@ @@.@@,@@ @@            @@");
	System.out.println("@@      @@    @@  @@ @@ @@`@@.@@ @@@@ ;;       @@");
	System.out.println("@@      @@    @@  @@ @@ @@ @@`@@ @@@@ @@       @@");
	System.out.println("@@                                             @@");
	System.out.println("@@                                             @@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

}


public void nunuprime(){
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@                                             @@");
	System.out.println("@@                                             @@");
	System.out.println("@@         @@@                     @@@         @@");
	System.out.println("@@         @@@                     @@@         @@");
	System.out.println("@@                                             @@");
	System.out.println("@@                                             @@");
	System.out.println("@@                  @@@@@@@@                   @@");
	System.out.println("@@               @@          @@                @@");
	System.out.println("@@            @@                @@             @@");
	System.out.println("@@          @                      @           @@");
	System.out.println("@@                                             @@");
	System.out.println("@@                                             @@");
	System.out.println("@@                                             @@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

}


}// end of class MyIntNumber definition
