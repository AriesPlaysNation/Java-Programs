// Brad Botteron
// 6/12/19
// M02 4.23

import java.io.IOException;
import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		
		// User input name
		System.out.print("Enter employee name: ");
		String name = input.nextLine();
		
		// User input Hours worked
		System.out.print("Enter the hours worked in a week: ");
		double hours = input.nextDouble();
		
		// User input hourly rate
		System.out.print("Enter hourly rate: ");
		double rate = input.nextDouble();
		
		// User input for federal tax ex: .2
		System.out.print("Enter federal tax withholding rate: ");
		double fedTax = input.nextDouble();
		
		// User input for state tax ex: .09
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		
		// Computes gross pay
		double grossPay = hours * rate;
		
		//[Header("Deductions")];
		// Apparently Headers don't work in Java lol
		
		// Calculations for federal and state taxes as well as total between both and netPay (gross - deductions)
		double fedWitholding = grossPay * fedTax;
		double stateWitholding = grossPay * stateTax;
		double totalWitholding = fedWitholding + stateWitholding;
		double netPay = grossPay - totalWitholding;
		
		// Friendly user output
		System.out.println(name);
		System.out.println(String.format("%.1f", hours));
		System.out.println("$" + String.format("%.2f", rate));
		System.out.println("Gross Pay: $" + String.format("%.2f", grossPay));
		System.out.println("Deductions");
		System.out.println("     Federal Witholding: (" + String.format("%.1f", fedTax * 100) + "%): $" + String.format("%.2f", fedWitholding));
		System.out.println("     State Witholding: (" + String.format("%.1f", stateTax * 100) + "%): $" + String.format("%.2f", stateWitholding));
		System.out.println("     Total Deductions: $" + String.format("%.2f", totalWitholding));
		System.out.println("Net Pay: $" + String.format("%.2f", netPay));
		
	}
}
