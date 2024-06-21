package class_object;
import java.util.*;
class book
{
	int price;
	String name;
	double id;
	
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the price");
		price=shubham.nextInt();
		System.out.println("enter the name of the book");
		name=shubham.next();
		System.out.println("enter the book id");
		id=shubham.nextDouble();
		
	}
	void display()
	{
		System.out.println("price="+price);
		System.out.println("name="+name);
		System.out.println("id="+id);
	}
}
public class bookInfo 
{

	public static void main(String[] args)
	{
		book b1=new book();
		b1.accept();
		b1.display();
		book b2=new book();
		b2.accept();
		b2.display();

	}

}
