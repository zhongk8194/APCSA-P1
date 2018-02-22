//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int randomNum, guess, guesses = 0, wrongAns = 0, percent;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		randomNum = (int) (Math.random()*upperBound);
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		
		do{
			System.out.println("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
			guesses ++;
			if (guess != randomNum)
				wrongAns++;
		} while (guess != randomNum);
		
	}
	
	public String toString()
	{
		String output= "It took " + guesses + " guesses to guess " + randomNum + "/nYou guessed right " + 100/guesses + " percent of the time. \n\n";
		return output;
	}
}
