//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab09f
{
	public static void main( String args[] )
	{
		LetterRemover one = new LetterRemover();
		one.setRemover("I am Sam I am", 'a');
		one.removeLetters();
		out.println(one);
		
		LetterRemover two = new LetterRemover();
		two.setRemover("ssssssssxssssesssssesss", 's');
		two.removeLetters();
		out.println(two);
		
		LetterRemover three = new LetterRemover();
		three.setRemover("qwertyqwertyqwerty", 'a');
		three.removeLetters();
		out.println(three);
		
		LetterRemover four = new LetterRemover();
		four.setRemover("abababababa", 'b');
		four.removeLetters();
		out.println(four);
		
		LetterRemover five = new LetterRemover();
		five.setRemover("abaababababa", 'x');
		five.removeLetters();
		out.println(five);
								
	}
}