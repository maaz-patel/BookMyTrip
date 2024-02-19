package BookMyTrip.com;
public class Bookmytripdrive 
{
	public static void main(String[]args)
	{
		Bookmytrip b=new Bookmytrip();
		for(;;)
		{
			System.out.println("1.Login 2.Bookmytickets 3.Cancel ticket 4.Displayticket 5.Changedate 6.Makepayement 7.Logout 8.exit");
			switch(b.sc.nextInt())
			{
			case 1:
				b.Login();
				break;
			case 2:
				b.Bookmytickets();
				break;
			case 3:
				b.Cancelmytickets();
				break;
			case 4:
				b.displaytickets();
				break;
			case 5:
				b.Changedate();
				break;
			case 6:
				b.Makepayement();
				break;
			case 7:
				b.Logout();
				break;
			case 8:
				return;
				
			}
		}
		
	}
}
