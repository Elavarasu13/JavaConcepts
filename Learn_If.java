class Learn_If
{
public static void main(String args[])
{
Learn_If li = new Learn_If();    // create an object using new keyword;
li.find_highest_scorer(90, 85);  //argument passing in method calling;
}

void find_highest_scorer(int vk , int msd) // varible declaration in method;
{
//int vk = 95;
//int msd = 100;
if(vk > msd)
{
System.out.println("Virat");
}
else if(msd > vk)
{
System.out.println("MSD");
}
else
{
System.out.println("Virat" );
System.out.println("MSD");
}
}
}

