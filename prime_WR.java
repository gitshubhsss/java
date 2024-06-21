package class_object;
import java.util.*;
class prime
{
	int n,div=0,i;
	
	void accept(int n)
	{
		this.n=n;
		
	}
	String Display(int n)
	{
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				div=1;
				break;
				
			}
		}
		if(div==0)
			{
				return "number is prime";
			}
			else
			{
				return "number is not prime";
			}
		}
	}
public class prime_WR 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the number");
		n=shubham.nextInt();
		prime p1=new prime();
		p1.accept(n);
	   String s1= p1.Display();
		System.out.println(" "+s1);
		

	}

}
