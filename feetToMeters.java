
public class feetToMeters {
	
	public static void main(String[] args) 
	{	
		double foot = 1.0;
		double meters = 20.0;
		
		System.out.println("Feet    Meters    |    Meters     Feet");
		System.out.println("---------------------------------------");
		
		for(int i = 0; i < 10; i++)
		{
			// Best formatting I could get
			System.out.printf("%-7s %1s %5s %8s %10s %n", foot, String.format("%.3f", feetToMeter(foot)), "|", meters, String.format("%.3f", meterToFeet(meters)));
			foot += 1.0;
			meters += 5.0;
		}
		
		
	}
	
	public static double feetToMeter(double feet)
	{
		double result;
		
		result = feet * .305;
		
		return result;
	}
	
	public static double meterToFeet(double meter)
	{
		double result;
		
		result = meter * 3.279;
		
		return result;
	}
}
