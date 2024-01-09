package Learning;

public class ArrayDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ArrayDemo ad = new ArrayDemo();
		ad.learn_array();

	}

	private void learn_array() {
		
		// TODO Auto-generated method stub
		//int[]marks = new int[6];
		
		int [] marks = {89,90,100,65,70,80};
		int i = 0;
		int count  = 0;
		while(i<marks.length)
		{
		if(marks[i]>=80)
		{
		//System.out.println(marks[i]);
count++;
		}
		i++;
		}
		System.out.println(count);
		
		
	}

}
