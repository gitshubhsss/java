package class_object;
import java.util.*;
class MAX
{
	int  a,b;
	void accept(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	String display(int a,int b)
	{
		if (a>b)
		{
			return "first number is greater that second";
		}
		else if(b>a)
		{
			return "second number is greater that first";
		}
		else 
		{
			return "both are equals";
		}
		
	}
}

public class Max_02 
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter first number");
		a=shubham.nextInt();
		System.out.println("enter second number");
		b=shubham.nextInt();
		MAX m1=new MAX();
		m1.accept(a, b);
		String s1=m1.display(a, b);
		System.out.println(" "+s1);

	}
}
