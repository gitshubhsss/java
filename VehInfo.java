package class_object;
import java.util.*;
class vehicle
{
	int price;
	String name,colour;
	double id;
	
	void accept()
	{
		Scanner shubham=new Scanner(System.in);
		System.out.println("enter the price");
		price=shubham.nextInt();
		System.out.println("enter the colour and name");
		colour=shubham.next();
		name=shubham.next();
		System.out.println("enter the vehicle id");
		id=shubham.nextDouble();
	}
	void display()
	{
		System.out.println("price="+price);
		System.out.println("colour="+colour);
		System.out.println("name"+name);
		System.out.println("id="+id);
		
	}
	
}
public class VehInfo 
{

	public static void main(String[] args) 
	{
		vehicle v1=new vehicle();
		v1.accept();
		v1.display();
		vehicle v2 =new vehicle();
		v2.accept();
		v2.display();

	}

}
