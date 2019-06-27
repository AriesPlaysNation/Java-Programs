
public class taxTable 
{
	public static void main(String[] args) 
	{
		System.out.printf("%-10s %1s %15s %10s %10s %n", "Taxable", "Single", "Married Joint", "Married", "Head of");
		System.out.printf("%-10s %1s %15s %11s %12s %n", "Income", "      ", "or Qualifying", "Seperate", "House hold");
		System.out.printf("%29s %n", "Widow(er)");
		System.out.println("----------------------------------------------------------");
		
		int taxableIncome = 50000;
		
		while(taxableIncome <= 60000)
		{
			System.out.printf("%-10s %2s %8s %16s %10s %n", taxableIncome, Math.round(computeTax(0, taxableIncome)), Math.round(computeTax(1, taxableIncome)),
					Math.round(computeTax(2, taxableIncome)), Math.round(computeTax(3, taxableIncome)));
			
			taxableIncome += 50;
		}
	}

	public static double computeTax(int status, double taxableIncome)
	{
		double tax = 0;
		
		switch(status)
		{
			case(0):
				tax = 8350 * .10 + (33950 - 8350) * .15 + (taxableIncome - 33950) * .25;
				break;
			case(1):
				tax = 16700 * .10 + (taxableIncome - 16700) * .15;
				break;
			case(2):
				tax = 8350 * .10 + (33950 - 8350) * .15 + (taxableIncome - 33950) * .25;
				break;
			case(3):
				tax = 11950 * .10 + (45500 - 11950) * .15 + (taxableIncome - 45500) * .25;
				break;
		}
		
		return tax;
	}
}
