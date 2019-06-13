// Brad Botteron
// 6/12/19
// M02 3.15

import java.io.IOException;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		
		// Picks a random number between 000 and 999
		int lottery = (int)(Math.random() * 1000);
		
		// User input guess
		System.out.print("Enter your lottery pick (3 Digits): ");
		int guess = input.nextInt();
		
		// Finding numbers of random lottery and guess numbers
		int lottery1 = lottery / 100;
		int lottery2 = lottery % 100 / 10;
		int lottery3 = lottery % 10;
		
		int guess1 = guess / 100;
		int guess2 = guess % 100 / 10;
		int guess3 = guess % 10;
		
		// If numbers are exact you win grand prize!
		if(guess == lottery)
		{
			System.out.println("Congratulations, you guessed all 3 numbers in order. You won $10,000!");
		}
		// If all 3 numbers match but not in the right number you get mid prize
		else if(((guess1 == lottery1) || (guess1 == lottery2) || (guess1 == lottery3))
	            && ((guess2 == lottery1) || (guess2 == lottery2) || (guess2 == lottery3))
	            && ((guess3 == lottery1) || (guess3 == lottery2) || (guess3 == lottery3)))
		{
			System.out.println("Congratulations, you guessed all 3 numbers. You won: $3,000!");
		}
		// if 1 number matches you get smallest prize
		else if(guess1 == lottery1 || guess1 == lottery2 || guess1 == lottery3
		        || guess2 == lottery1 || guess2 == lottery2 || guess2 == lottery3
		        || guess3 == lottery1 || guess3 == lottery2 || guess3 == lottery3)
		{
			System.out.println("Congratulations, you guess at least 1 number. You won: $1,000");
		}
		// No numbers match no prize
		else
		{
			System.out.println("Sorry, you didn't match any numbers. You won: $0");
		}
	}

}