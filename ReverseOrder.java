package ArrayTasks;

public class ReverseOrder {

	public static void main(String[] args) {
		ReverseOrder r =  new ReverseOrder();
		r.reverseChar();
		//r.copyingArray();
	}

	private void reverseChar() 
	{
		// TODO Auto-generated method stub
		char[] name = {'s','t','a','l','i','n'};
		int i = 0, j = name.length-1;
		while(i<j)
		{
			char temp = name[i];
			name[i] = name[j];
			name[j] = temp;
			i++;
			j--;
		}
		for(int k = 0;k<name.length;k++)
		{
			System.out.println(name[k] + " ");
		}
		
	}

	private void copyingArray() 
	{
		// TODO Auto-generated method stub
		int [] a =  {10,20,30,40};
		int [] b = new int[a.length];
		int i = 0;
		int j = a.length-1;
		while(i<a.length)
		{
			b[i] = a[j];
			System.out.println(b[i]);
			i++;
			j--;
		}
	}


	}


