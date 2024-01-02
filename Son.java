package thanjavur;

public class Son extends Father {
int age = 45;
	public static void main(String[] args) {
		// single inheritance in same package
       Son son = new Son();
       son.share_assets();
       son.yield();
         int father_amount = son.getAmount(); 
         System.out.println("Before : "  + father_amount );
         son.setAmount(110000000);
         father_amount = son.getAmount();
         System.out.println("After : "  + father_amount );
         
       //  System.out.println(son.age);
         Father  f =  new Father(); // Father class object
       //  System.out.println(f.age); 
         son.work();
	}
	void work()
	{
		System.out.println(this.age);
		System.out.println(super.age);
	}
}
