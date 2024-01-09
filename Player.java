package ArrayTasks;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Player p = new Player();
		p.playerAverage();

	}

	private void playerAverage() 
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the player name:");
		String name = sc.nextLine(); 
		System.out.println("Number of Matches:");
		int matches  =  sc.nextInt();	
		int [] scores = new int[matches];
		int i = 0 , overall = 0;
		while(i<scores.length)
		{
			System.out.println("Enter the score of Match "+ (i+1));
			scores[i] = sc.nextInt();
			overall = overall + scores[i];
			i++;
		}
		System.out.println("Player:" + name + "Overall Score inthe 2023 wcup is "+overall);
	    double average  = overall / matches;
	    System.out.println("Average of " + name + "is" + average);
	}

}
