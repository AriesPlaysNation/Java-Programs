import java.util.Scanner;

public class highestNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Declaring max entries(students), tempscore(score), 
		 * high Scores, tempname(name), high names, etc */
		
		int students;
		int score;
		int highestScore = 0;
		int secondHighestScore = 0;
		
		String name = "";
		String name1 = "";
		String name2 = "";
		
		
		System.out.print("Enter how many student's info you would like to enter: ");
		students = input.nextInt();
		
		// for loop to continue entering until max number of students
		for(int i = 1; i <= students; i++)
		{
			System.out.print("Enter student " + i + " name: ");
			name = input.next();
			while(name == "")
			{
				System.out.println("ERROR: Cannot accept empty names");
				System.out.print("Enter student " + i + " name: ");
				name = input.next();
			}
			
			System.out.print("Enter student " + i + " score: ");
			score = input.nextInt();
			while(score < 0)
			{
				System.out.println("ERROR: Score cannot be negative");
				System.out.print("Enter student " + i + " score: ");
				score = input.nextInt();
			}
			
			if(score > secondHighestScore)
			{
				if(score > highestScore)
				{
					secondHighestScore = highestScore;
					name2 = name1;
					highestScore = score;
					name1 = name;
				}
				else if(score > secondHighestScore && score < highestScore)
				{
					secondHighestScore = score;
					name2 = name;
				}
			}
		}
		
		System.out.println("Student " + name1 + " scored the highest with: " + highestScore);
		System.out.println("Student " + name2 + " scored the second highest with: " + secondHighestScore);
	}

}
