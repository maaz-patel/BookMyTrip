package BookMyTrip.com;
import java.util.Scanner;
public class Airlines
{
	String from ;
	String to;
	String date;
	float km;
	Airlines()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the star from;");
		this.from=sc.next();
		System.out.println("enter the to");
		this.to=sc.next();
		System.out.println("enter the date");
		this.date=sc.next();
		System.out.println("enter the km");
		this.km=sc.nextFloat();
	}
}
