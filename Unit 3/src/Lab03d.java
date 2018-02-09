//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Distance one = new Distance();
		one.setCoordinates(1,1,2,1);
		one.calcDistance();
		one.print();

		Distance two = new Distance();
		two.setCoordinates(1,1,-2,2);
		two.calcDistance();
		two.print();

		Distance three = new Distance();
		three.setCoordinates(1,1,0,0);
		three.calcDistance();
		three.print();	
			
	}
}