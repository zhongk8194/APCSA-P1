//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Prime test1 = new Prime();
		test1.setPrime(24);
		test1.isPrime();
		out.println(test1);
		
		Prime test2 = new Prime();
		test2.setPrime(7);
		test2.isPrime();
		out.println(test2);
		
		Prime test3 = new Prime();
		test3.setPrime(100);
		test3.isPrime();
		out.println(test3);
		
		Prime test4 = new Prime();
		test4.setPrime(113);
		test4.isPrime();
		out.println(test4);
		
		Prime test5 = new Prime();
		test5.setPrime(65535);
		test5.isPrime();
		out.println(test5);
		
		Prime test6 = new Prime();
		test6.setPrime(2);
		test6.isPrime();
		out.println(test6);
		
		Prime test7 = new Prime();
		test7.setPrime(7334);
		test7.isPrime();
		out.println(test7);
		
		Prime test8 = new Prime();
		test8.setPrime(7919);
		test8.isPrime();
		out.println(test8);
		
		Prime test9 = new Prime();
		test9.setPrime(1115125003);
		test9.isPrime();
		out.println(test9);
		
	}	
}