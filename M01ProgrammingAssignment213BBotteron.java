/* Author: Brad Botteron
 * Assignment: M01 Programming Assignment 2-13
 * Date: 6/10/19
 * Desc: Finding the total savings after 6 months based off of monthly
 * Desc: savings (user input)
 */

import java.util.Scanner;

public class M01ProgrammingAssignment213BBotteron 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double totalSavings = 0;
		
		double interest = .05/12;
		
		int months = 6;
		
		System.out.print("Enter the amount of monthly savings: ");
		double monthlySavingsAmount = input.nextDouble();
		
		for(int i = 0; i < months; i++)
		{
			totalSavings = (monthlySavingsAmount + totalSavings) * (1 + interest);
		}
		
		System.out.println("Your total savings after 6 months is: " + totalSavings);
	}
}