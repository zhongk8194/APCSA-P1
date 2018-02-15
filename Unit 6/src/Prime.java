//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(0);
		number = 0;

	}

	public Prime(int num)
	{
		setPrime(number);

	}

	public void setPrime(int num)
	{
		number = num;
		
	}

	public boolean isPrime()
	{
		int i;
		for (i = 2; i < Math.sqrt(number); i++){
			if (number % i == 0){
				return false;
			}
		}

		return true;
	}

	public String toString()
	{
		if (isPrime() == false)
			return number + " is not prime. \n";
		else 
			return number + " is prime. \n";

	}
}