package class_object;
import java.util.*;
class Sum
{
	int n,f1,sum=0;
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter one number");
		n=shubham.nextInt();
	}
	void display()
	{
		while(n>0)
		{
			f1=n%10;
			n=n/10;
			sum=sum+f1;
			
			
		}
		System.out.println("sum of the number = "+sum);
	}
}
public class Sum_All 
{

	public static void main(String[] args) 
	{
		Sum s1=new Sum();
		s1.accept();
		s1.display();
		

	}

}
