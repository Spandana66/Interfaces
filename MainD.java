package Interface;

public class MainD implements Demo
{
public void display()
{
	System.out.println("overriden in main class");
}
public static void main(String[] args)
{
	Demo d=new MainD();
	d.display();
}
}
