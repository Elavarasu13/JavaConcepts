package ArrayTasks;

public class SecondIndex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SecondIndex s =  new SecondIndex();
		s.oddIndex();
		s.evenIndex();

	}

	private void evenIndex() 
	{
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40,50,60};
		int [] b = new int[a.length/2];
		int i =0;
		int j =0;
		while(i<b.length)
		{
			b[i] = a[j];
			System.out.println(b[i]);
			i++;
			j+=2;
		}
		
		
		
	}

	private void oddIndex()
	{
		// TODO Auto-generated method stub
		int [] a = {10,20,30,40,50,60};
		int [] b = new int[a.length/2];
		int i =0;
		int j =1;
		while(i<b.length)
		{
			b[i] = a[j];
			System.out.println(b[i]);
			i++;
			j+=2;
		}
		
	}

}
