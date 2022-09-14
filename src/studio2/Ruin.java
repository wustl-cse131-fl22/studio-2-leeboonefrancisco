package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter win limit: ");
		double winLimit = in.nextInt();
		double winChance = 0.0;
		System.out.println("How many days?: ");
		int totalSimulations = in.nextInt();
		int daysWon = 0; 
		int daysLost = 0; 
		for (int i = totalSimulations; i > 0; i--)
		{
			while (startAmount < winLimit && startAmount >= 0)
			{
				winChance = Math.random();
				if (winChance >= 0.5)
				{
					startAmount++;
					//System.out.println("Win");	
					//daysWon++;
				}
				else
				{
					startAmount--;
					//System.out.println("Loss");
					//daysLost++;
				}
				//daysWon + daysLost > totalSimulations;
			}
		}
		System.out.print(startAmount);
		System.out.println("Number of days won: "+ daysWon);
		System.out.println("Number of days lost: " + daysLost);
		// TODO Auto-generated method stub

	}

}
