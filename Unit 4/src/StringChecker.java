//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		setString("");
		
	}

	public StringChecker(String s)
	{
		setString(word);

	}

   public void setString(String s)
   {
	   word = s;
   }

	public boolean findLetter(char c)
	{
		if (word.indexOf(c) == -1) {
		
			return false;
		}
		else {
			 
			return true;
		}
	}

	public boolean findSubString(String s)
	{
		if (word.indexOf(s) == -1) {
			
			return false;
		}
		else {
			 
			return true;
		}

	}

 	public String toString()
 	{
 		return word + "\n";
	}
}