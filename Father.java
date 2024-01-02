package thanjavur;

public class Father {
	private int amount = 100000000;
	int age = 75;
	
	public void setAmount(int amount)
	{
		if(amount  > 100000000)
			this.amount = amount;
	}
	
	public int getAmount()
	{
		return amount;    //getter method
	}
		
		void yield() // default access // access only same package
		{
			System.out.println("Yield Paddy");
		}
		
		protected void share_assets() // all classes in same package
		{
			System.out.println("Sharing Assests");
		}

	}


