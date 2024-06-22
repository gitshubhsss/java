package class_object;
import java.util.*;
class Maximum
{
	int a,b;
	void accept(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	String display()
	{
		if(a>b)
		{
			return "first number is greater than second";
			
		}
		else if(a<b)
		{
		   return "second is greater than first";	
		}
		else 
		{
			return "both are equals";
		}
	}
	
}
public class Stud_Wr 
{

	public static void main(String[] args)
	{
		
	    int a,b,i,n;//globali here we are declaring the variables
	    Scanner shubham=new Scanner (System.in);
	    System.out.println("enter number of records");
	    n=shubham.nextInt();
	    Maximum m1[]=new Maximum[n];//object creation
	    
	    	for(i=1;i<=n;i++)
	    	{
	    	m1[i]=new Maximum();
	    	System.out.println("enter the first number");
	    	a=shubham.nextInt();
	    
		    System.out.println("enter the second number");
		    b=shubham.nextInt();
		    m1[i].accept(a,b);//parameter passing 
		    System.out.println(" "+m1[i].display());//display
		    
	    	
		   // Maximum m1[]=new Maximum[n];
		    
	    	}
	    
	    }
	    

	}


