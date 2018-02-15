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
	private int randomNum;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		randomNum = (int) Math.random()*upperBound;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		while (keyboard.nextInt() < upperBound)
			




	}

	public String toString()
	{
		String output="";
		return output;
	}
}