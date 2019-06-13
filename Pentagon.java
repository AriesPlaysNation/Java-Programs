// Brad Botteron
// 6/12/19
// M02 4.1

import java.io.IOException;
import java.util.Scanner;

public class Pentagon {

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		
		// User input for radius from center to a vertices
		System.out.print("Please enter the length from the center of the pentagon to a vertices: ");
		double radius = input.nextDouble();
		
		// Computes the sides based off user input
		double side = 2 * radius * Math.sin(Math.PI / 5);
		
		// Computes the area based off the side
		double area = (5 * (side * side)) / (4 * Math.tan(Math.PI / 5));
		
		// User output
		System.out.println("The area of the pentagon is " + String.format("%.2f", area));
	}
}
