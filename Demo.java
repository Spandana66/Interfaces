package Interface;

public interface Demo 
{
int a=20;
void display();
static void play()
{
	System.out.println(a);
	//a=20;(not possible)
}
}
