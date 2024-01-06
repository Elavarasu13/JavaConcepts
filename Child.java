package OOpsLearning;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
	//	ch.balance = 5000;
	//  ch.receive();
		ch.develope_Java_applications();
		//Dynamic Binding
		Parent pa = new Child(); //parent sharing child memory
		pa.Cook(); // parent nature
		pa.receive();//child nature
		System.out.println(ch.balance);
	}
	
	public void develope_Java_applications()
	{
		System.out.println("JavaDeveloper");
	}
	
	protected void receive() // or public
	{
		System.out.println("Taking care of relatives " + 
	"Taking care of friends");
		//method overriding
		//Parent p = new Parent();
		//super.receive();
	}
	//void getMarried()

}
