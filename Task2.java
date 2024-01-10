package ArrayTasks;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 t = new Task2();
		t.addingTwoarrays();
		t.negativeNum();
		t.oddIndexNum();

	}

	private void oddIndexNum() 
	{
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		int total = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(i%2 !=0)
			{
				total = total + a[i];
			}
		}
		System.out.println(total); 
	}

	private void negativeNum() 
	{
		// TODO Auto-generated method stub
		int [] a = {10,-10,20,-20,30,-30};
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] <0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

	private void addingTwoarrays()
	{
		// TODO Auto-generated method stub
		int [] a = {10,20,30};
		int [] b = {30,20,10,40};
		int len = a.length > b.length ? a.length :b.length;
		int [] c = new int[len];
		for(int i = 0;i<c.length;i++)
		{
			if(i<a.length)
			{
			c[i] = a[i] + b[i];
			//System.out.println(c[i]);
			}
			else
			{
				c[i] = b[i];
				//System.out.println(c[i]);
			}
			System.out.println(c[i]);
		}
		
		
	}

}
