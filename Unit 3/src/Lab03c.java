//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
   	Quadratic one = new Quadratic();
   	one.setEquation(5, -8, 3);
   	one.calcRoots();
   	one.print();
   	
   	Quadratic two = new Quadratic();
   	two.setEquation(3, 2, -7);
   	two.calcRoots();
   	two.print();
   	
   	Quadratic three = new Quadratic();
   	three.setEquation(9, 6, 1);
   	three.calcRoots();
   	three.print();
   	
   	
		
		
	}
}