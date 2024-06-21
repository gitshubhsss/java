package class_object;
import java.util.*;
class prime
{
	int n,div=0,i;
	
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter one number");
		n=shubham.nextInt();
		
	}
	void display()
	{
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				div=1;
				break;
			}
			else if(div==0)
			{
				System.out.println("number is prime");
				
			}
			else
			{
				System.out.println("number is not prime");
			}
		}
	}
}
public class prime_demo 
{

	public static void main(String[] args) 
	{
		prime p1=new prime();
		p1.accept();
		p1.display();

	}

}
