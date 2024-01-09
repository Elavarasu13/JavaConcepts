package Learning;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 ar = new Array2();
		//ar.separateNum();
		//ar.reverseNum();
		ar.calculatePercentage();

	}

	private void calculatePercentage() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Subjects?");
	int subject = 	sc.nextInt();
	int[]  marks =  new int[subject];
	int total = 0;
	float percentage  = 0;
	int i = 0;
	while(i<marks.length)
	{
		System.out.println("Enter Marks:");
		marks[i] = sc.nextInt();
		total = total + marks[i];
		i++;
		percentage  = total /i;
		}
	System.out.println("Your Total is:" + total);
	System.out.println("Your Percentage is:" + percentage);
		
	}



	private void reverseNum() {
		// TODO Auto-generated method stub
		int [] nums = {56 , 67 , 87 , 49 , 60};
		int i = nums.length-1;
		while(i>=0)
		{
			System.out.println(nums[i]);
			i--;
		}
		
	}

	private void separateNum() 
	{
		// TODO Auto-generated method stub
		int []nums = {56 , 65 , 87};
		int i =0;
		while(i<nums.length)
		{
			int x = nums[i] / 10;
			int y = nums[i] % 10;
			if(x < y)
			{
				System.out.println(nums[i]);
			}
			i++;
		}
		
	}

}
