//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats one = new LoopStats();
		one.setNums(1, 5);
		one.getEvenCount();
		one.getOddCount();
		one.getTotal();
		out.println(one);
		
		LoopStats two = new LoopStats();
		two.setNums(2, 8);
		two.getEvenCount();
		two.getOddCount();
		two.getTotal();
		out.println(two);
		
		LoopStats three = new LoopStats();
		three.setNums(5, 15);
		three.getEvenCount();
		three.getOddCount();
		three.getTotal();
		out.println(three);
		
		
		
		
		
					
	}
}