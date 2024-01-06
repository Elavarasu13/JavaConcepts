package OOpsLearning;

public class India {
	static String pm = "Modiji"; // Class specific // static 
	String capital = "New Delhi"; // non static
	static int inr_value = 81; // object specific
	String state; // non-static

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		India.inr_value = 80;
		India.conduct_election();// static method
		India in = new India();
		in.state = "Tamilnadu"; 
		India in2 = new India();
		in.cast_your_vote("Admk"); //non-static method
		in2.state  = "Kerala";
		in2.cast_your_vote("bjp");
		System.out.println(India.pm); // class calling
		System.out.println(in.state); // object calling
		System.out.println(in2.state);
		System.out.println(India.inr_value);
	}
	void cast_your_vote(String party)
	{
		System.out.println(party);
		//non-static method
	}
	static void conduct_election()
	{
		//static method
	}
	
	}
	


