package class_object;
import java.util.*;
class SWAP
{
	int a,b;
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("a=");
		a=shubham.nextInt();
		System.out.println("b=");
		b=shubham.nextInt();
		
	}
	void display()

	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);	}
}
public class Swap_Nr 
{

	public static void main(String[] args) 
	{
		SWAP s1=new SWAP();
		s1.accept();
		s1.display();

	}

}
