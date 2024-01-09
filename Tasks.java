package Learning;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Tasks p = new Tasks();
		//p.profit_Percent();
		p.find_highest();
		//p.find_lowest();

	}

	private void find_lowest() {
		// TODO Auto-generated method stub
		int []marks = {96,78,100,99,92};
		int lowest = marks[0];
		int i = 1;
		int index = 0;
		while(i<marks.length)
		{
			if(marks[i]<lowest)
			{
				lowest = marks[i];
				index = i;
			}
			i++;
		}
		System.out.println(lowest);
	}

	private void find_highest() 
	{
		// TODO Auto-generated method stub
		int []marks = {96,78,100,99,92};
		String [] sub = {"Tamil","english","Maths","Science","Social"};
		int highest = marks[0];
		int lowest = marks[0];
		int i = 1;
		int index = 0;
		int index2 = 0;
		while(i < marks.length)
		{
		if(marks[i] > highest)
		{
			highest = marks[i];
			index = i;
		}
		if(marks[i] < lowest)
		{
			lowest = marks[i];
			index2 = i;
		}
		i++;
		}
		System.out.println("highest Mark is " + highest + "from  " +sub[index]);
		
		System.out.println("Lowest Marks is" + lowest + "from " + sub[index2]);
	}

	private void profit_Percent() 
	{
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Travelling Expenses Per day for son:");
		int son = sc.nextInt();
		System.out.println("Working day in a month for son :");
		int wdays = sc.nextInt();
		System.out.println("Travelling Expenses Per day for daughter:");
		int daughter = sc.nextInt();
		System.out.println("Working day in a month for daughter :");
		int wdayd = sc.nextInt();
		int son_expenses = son * wdays;
		int daughter_expenses = daughter * wdayd;
		int total_expenses = son_expenses + daughter_expenses;
		System.out.println("TotalExpenses:" + total_expenses);
		System.out.println("After tn govt announced Free for women:");
		int current_expenses = total_expenses - daughter_expenses;
		System.out.println("Your current  expenses is " + current_expenses);
		int profit =   total_expenses - current_expenses;
		System.out.println("Your profit is:" + profit);
	}

}
