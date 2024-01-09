package ArrayTasks;

public class Array3 {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		Array3 ar = new Array3();
		int [] marks = {92,78,89,99,96};
		ar.find_second_biggest(marks);

	}

	private void find_second_biggest(int[] marks) 
	{
		// TODO Auto-generated method stub
		int big =0,sbig =0;
		int i = 0;
		while(i<marks.length)
		{
		if(marks[i] > big)
		{
			sbig = big;
			big = marks[i];
		}
		else if (marks[i] > sbig)
		{
			sbig = marks[i];
		}
		i++;
		}
		System.out.println("Biggest num is " + big);
		System.out.println("Second Biggest num is " + sbig);
	}

}
