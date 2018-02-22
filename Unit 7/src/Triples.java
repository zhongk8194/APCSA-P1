//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
		number = 0;
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(number);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	/**public String getTriples(int a, int b, int c)
	{
		String output = "";
		for (a = 1; a <= number; a++)
		{
			for (b = 1; b <= number; b++)
			{
				for (c = 1; c <= number; c++)
				{
					if ((a * a) + (b * b) == (c * c)){
						if ((a % 2 != 0) && (b % 2 == 0) && (c % 2 != 0) || (a % 2 == 0) && (b % 2 != 0) && (c % 2 != 0)){
							output = a + "" + b + "" + c;
						}
					}
				}
			}
		}
		return output;
	}**/
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = -1;
		for (int i = 2; i <= a; i++)
		{
			if (a % i == 0 && b % i == 0 && c % i == 0)
				return 0
		}

		return 1;
	}

	public String toString()
	{
		String output = "";
		for (int i = 1; i <= number; i++)
		{
			for (int j = i + 1; j <= number; j++)
			{
				for (int k = j + 1; k <= number; k++)
				{
					if ((i * i) + (j* j) = (k * k)) && ((i % 2 == 1 && j % 2 == 0 && k % 2 == 1) || (i % 2 == 0 && j % 2 == 1 && k % 2 == 1)) && (greatestCommonFactor(i, j, k) == 1))
						output += i + " " + j + " " + k + "\n";
				}
		    
					}
					
				}
			}
		}
		return output + "\n";
	}
}
