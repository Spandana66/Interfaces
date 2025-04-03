package Interface;

public class Mainclass implements Sample,Sample1
{
public void play()
{
	System.out.println("play from main class");
}
public void stop()
{
	System.out.println("stop from main class");
}
public static void main(String[] args) 
{
	Sample s=new Mainclass();
	Sample1 s1=new Mainclass();
	s.play();
	s1.stop();
}
}
