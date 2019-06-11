/* Author: Brad Botteron
 * Assignment: M01 Programming Assignment 2-3
 * Date: 6/10/19
 * Desc: Converting user input Feet to meters
 */

import java.util.Scanner;

public class M01ProgrammingAssignment23BBotteron 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for feet: ");
		double feet = input.nextDouble();
		
		double meters = feet * .305d;
		
		System.out.println(meters);
	}
}
