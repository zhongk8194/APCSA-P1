//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response = 'y';
		
		while (response == 'y')
		{
			System.out.print("Guessing Game - how many numbers? ");
			GuessingGame one = new GuessingGame(keyboard.nextInt());
			one.playGame();
			System.out.println(one.toString() + "/n")
		}

	}
}
