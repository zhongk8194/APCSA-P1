//� A+ Computer Science  -  www.apluscompsci.com
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
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		limit
		int max = 0;
		

		return 1;
	}**/

	public String toString()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		String output = "";
		for (a = 1; a <= number; a++)
		{
			int aa = a * a;
			b = a + 1;
			c = b + 1;
			while (c <= number){
				int cc = aa + b*b;
				while (c*c < cc) {c++;}
				{
					if (c*c == cc && c <= number)
					{
						int limit = Math.min(a, b);
					    limit = Math.min(limit, c);
					    for(int n = limit; n >= 2; n--)
					    {
					        if ( (a % n == 0) && (b % n == 0) && (c % n == 0) ) {
					            if (n > 1)
					            	output = output;
					            else
					            	output = output + a + " " + b + " " + c + "\n";
					        }
					    }
						/**if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0)
							output = output;
						else if (a % 3 == 0 && b % 3 == 0 && c % 3 == 0)
							output = output;
						else
							output = output + a + " " + b + " " + c + "\n";**/
					}
					b++;
				}
			}
		}
		return output + "\n";
	}
}