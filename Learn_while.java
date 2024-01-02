class Learn_while
{
public static void main(String args[])
{
Learn_while story = new Learn_while();
story.find_security(1024);
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

