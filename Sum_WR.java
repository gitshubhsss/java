package class_object;
import java.util.*;
class sum
{
	int n,f1,sum=0;
	
	void accept(int n)
	{
		this.n=n;
	}
     int display(int n)
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter any number");
		n=shubham.nextInt();
		while(n>0)
		{
			f1=n%10;
			n=n/10;
		    sum=sum+f1;
		    return 0;
		}
		
	}
}
public class Sum_WR 
{
	

	public static void main(String[] args) 
	{
		int n;
		Scanner shubham=new Scanner (System.in);
		System.out.println("enter any number");
		n=shubham.nextInt();
		sum s1=new sum();
		s1.accept(n);
		int z1=s1.display();		
		System.out.println("  "+z1);
		// TODO Auto-generated method stub

	}

}
