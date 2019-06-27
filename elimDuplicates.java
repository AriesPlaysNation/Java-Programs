import java.util.Scanner;
import java.util.Arrays;

public class elimDuplicates 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int[] myList = new int[10];
		
		System.out.println("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++)
		{
			myList[i] = input.nextInt();
		}
		eliminateDuplicates(myList);
	}
	
	public static void eliminateDuplicates(int[] list)
	{
		int index = 0;
		int refinedAmount = 0;
		int[] tempList = new int[10];

		for(int i = 0; i < list.length; i++)
		{
		    for(int j = i; j < list.length; j++)
		    {
		        if(j + 1 < list.length - 1 && list[i] == list[j + 1])
		        {
		            break;
		        }
		        else if(j == list.length - 1)
		        {
		            tempList[index] = list[i];
		            index++;
		            refinedAmount++; 
		        }
		    }
		}

		int[] refinedList = new int[refinedAmount - 1];
		for(int i = 0; i < refinedList.length; i++)
		{
		    refinedList [i] = tempList[i];
		}
		
		for(int i = 0; i < refinedList.length; i++)
		{
			System.out.print(refinedList[i] + " ");
		}
	}
}
