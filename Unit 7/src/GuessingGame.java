//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int randomNum;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		randomNum = (int) (Math.random()*upperBound);
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int guess;
		int guesses = 1;
		System.out.println("Enter a number between 1 and " + upperBound);
		guess = keyboard.nextInt();

		while (guess != randomNum){
			System.out.println("Enter a number between 1 and " + upperBound);
			guesses = guesses + 1;
			guess = keyboard.nextInt();
			}
		
		double percent = ((guesses - 1)/ guesses) * 100;
		System.out.println("It took " + guesses + " guesses to guess " + randomNum);
		System.out.println("You guessed wrong " + percent + " percent of the time.");
	}
	
	public String toString()
	{
		String output="";
		return output;
	}
}