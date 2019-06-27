
public class calculator2 {

	public static void main(String[] args) 
	{
		int result = 0;
		if(args.length != 3)
		{
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(1);
		}
		
		if(!isNumeric(args[0]) || !isNumeric(args[2]))
		{
			System.out.println("Try entering an integer next time");
			System.exit(1);
		}
		
		switch(args[1])
		{
			case "+": result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case "-": result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case ".": result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case "/": result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
				break;
		}
		
		System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
	}
	
	public static boolean isNumeric(String strNum)
	{
		return strNum.matches("-?\\d+(\\.\\d+)?");
	}
}
