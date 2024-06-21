package class_object;
import java.util.*;
class Max
{
	int a,b;
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter first number");
		a=shubham.nextInt();
		System.out.println("enter second number");
		b=shubham.nextInt();
		
	}
	void display()
	{
		if(a>b)
		{
			System.out.println("first number is greater than second number");
			
		}
		else if(b>a)
		{
			System.out.println("second number is greater than first number");
		}
		else
		{
			System.out.println("both are equals ");
		}
		
	}
}
public class Max_2 
{

	public static void main(String[] args)
	{
		Max m1=new Max();
		m1.accept();
		m1.display();

	}

}
