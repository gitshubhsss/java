package class_object;
import java.util.*;
class student
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
		System.out.println("roll number :"+roll);
		System.out.println("name:"+name);
		
	}
}
public class collage_practicals
{

	public static void main(String[] args) 
	{
		student s1=new student();
		s1.accept();
		s1.display();
		
      
	}

}
