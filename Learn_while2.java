class Learn_while2
{
public static void main(String args[])
{
Learn_while2 story = new Learn_while2();
//story.find_security(1024);
story.find_flowers(7);
}
void find_flowers(int temples)
{
 // until temples count becomes 0 
 int flowers_count = 1;
 while(temples > 0)
 {
 flowers_count = flowers_count * 2;
 temples = temples - 1 ;
 }
 System.out.println("Flowers count is " + flowers_count);
}
void find_security(int beats)
{
int security = 0;
while(beats >1)
{
System.out.println("Each Security gets " + (beats/2));
beats = beats /2;
 security = security + 1 ;
}
System.out.println("Total no of security" + security);
}
}

