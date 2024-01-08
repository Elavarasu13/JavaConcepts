package OOpsLearning;

public class GroceryShop {
	
	int mrp , discount , actual_price; 
	//Global , non-static variables
	
	GroceryShop()
	{
		// constructor Overloading
		System.out.println("Free Home Delivery");
	}
	GroceryShop(int mrp)
	{
		//constructor Overloading
	}
	
	
	GroceryShop(int mrp,int discount)
	{
		//when we manually visible the constructor 
		//its not default constructor.
		this();
		this.mrp = mrp;
		this.discount = discount;
		this.actual_price = calculate_price(mrp , discount);
		System.out.println(this.actual_price);
		System.out.println("Welcome " + calculate_price(mrp , discount));
	}
	
	private int calculate_price(int mrp, int discount)
	{
		// TODO Auto-generated method stub
		return mrp - discount;
		
	}

	//default constructor is invisible
	public static void main(String args[])
	{
		GroceryShop prod1 = new GroceryShop(100 , 10);
	}

}
