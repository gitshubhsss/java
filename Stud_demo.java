package class_object;
import java.util.*;
class Stud
{
	int roll;
	String name;
	
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter roll number");
		roll=shubham.nextInt();
		System.out.println("enter the name of the student ");
		name=shubham.next();
		
	}
	void display()
	{
		System.out.println("roll number="+roll);
		System.out.println("name -"+name);
	}
}
public class Stud_demo
{
	public static void main(String []args)
	{
		int n,i;
		Scanner shubham=new Scanner(System.in);
		Stud s1[]=new Stud[n]//creation of array
		for(i=0;i<=n;i++)
		{
			s1[i]=new Student();//object creation 
			s1[i].accept();//parameter passing
			s1[i].display();//parameter passing 
		}
			
		
	}

}
