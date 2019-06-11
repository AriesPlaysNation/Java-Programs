/* Author: Brad Botteron
 * Assignment: M01 Programming Assignment 1-7
 * Date: 6/10/19
 * Desc: Calculating Pi
 */

public class M01ProgrammingAssignment17BBotteron 
{
	public static void main(String[] args)
	{
		double pi = (4 * (1.0 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11));
		System.out.println(pi);
		
		double pi2 = (4 * (1.0 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13));
		System.out.println(pi2);
	}
}

// I'm not really sure why these are pushing out an integer...I've tried different combinations
// and nothings working