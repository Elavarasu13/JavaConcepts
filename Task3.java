package ArrayTasks;

public class Task3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Task3 t = new Task3();
		
		int [] a = {10,20,30,40,50};
		for(int j =1;j<=3;j++)
		{
		a = t.shiftLeft(a);
		}
		for(int i =0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

	private int[] shiftLeft(int [] a) 
	{
		// TODO Auto-generated method stub
	//	int [] a = {10,20,30,40,50};
		//for(int j= 1;j<=5;j++)
		//{
		int temp = a[0];
		int i =0;
		while(i<a.length-1)
		{
			a[i] = a[i+1];
	      System.out.println(a[i] + " ");
			i++;
		}
		a[i] = temp;
	//	System.out.println(a[i] + " ");
		return a;
		}
		
	}

//}
