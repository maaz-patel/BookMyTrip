package BookMyTrip.com;

import java.util.Scanner;
public class Bookmytrip 
{
	User u;
	Airlines a;
	Scanner sc=new Scanner(System.in);
	public void Login()
	{
		if(u==null)
		{
			System.out.println("enter username");
			String username=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			u=new User(username,password);
			System.out.println("account login successfully");
		}
		else
		{
			System.out.println("Your are already login");
		}	
	}
	
	public  void Bookmytickets()
	{
		if(u==null)
		{
			System.out.println("Please Login first");
		}
		else
		{
			if(a==null)
			{
				System.out.println("1.AirIndia 2.AirAsia 3.Indigo");
				switch(sc.nextInt())
				{
					case 1:
					{
						System.out.println("enter the name");
						String name=sc.next();
						System.out.println("enter the age");
						int age=sc.nextInt();
						System.out.println("enter the gender");
						char gender=sc.next().charAt(0);
						System.out.println("enter the mb.no");
						long mbno=sc.nextLong();
						System.out.println("enter the adhar no");
						long adharno=sc.nextLong();
						System.out.println("Are you vacinated 1.Yes 2.No");
						int vacinated=sc.nextInt();
						switch(vacinated)
						{
						case 1:
							System.out.println("you can book tickets");
							a=new AirIndia(name,age,gender,mbno,adharno,vacinated);
							break;
						case 2:
							System.out.println("you can't book tickets you have take vaccine");
							break;
						}
						break;
					}
					case 2:
					{
						System.out.println("enter the name");
						String name=sc.next();
						System.out.println("enter the age");
						int age=sc.nextInt();
						System.out.println("enter the gender");
						char gender=sc.next().charAt(0);
						System.out.println("enter the mb.no");
						long mbno=sc.nextLong();
						System.out.println("enter the adhar no");
						long adharno=sc.nextLong();
						System.out.println("Are you vacinated 1.Yes 2.No");
						int vacinated=sc.nextInt();
						switch(vacinated)
						{
						case 1:
							System.out.println("you can book tickets");
							a=new AirIndia(name,age,gender,mbno,adharno,vacinated);
							break;
						case 2:
							System.out.println("you can't book tickets you have take vaccine");
							break;
						}
						break;
					}
					case 3:
					{
						System.out.println("enter the name");
						String name=sc.next();
						System.out.println("enter the age");
						int age=sc.nextInt();
						System.out.println("enter the gender");
						char gender=sc.next().charAt(0);
						System.out.println("enter the mb.no");
						long mbno=sc.nextLong();
						System.out.println("enter the adhar no");
						long adharno=sc.nextLong();
						System.out.println("Are you vacinated 1.Yes 2.No");
						int vacinated=sc.nextInt();
						switch(vacinated)
						{
						case 1:
							System.out.println("you can book tickets");
							a=new AirIndia(name,age,gender,mbno,adharno,vacinated);
							break;
						case 2:
							System.out.println("you can't book tickets you have take vaccine");
							break;
						}
						break;
					}			
				}
			}
			else
			{
				System.out.println("You already book tickets");
			}
		}
	}
	
	public void Cancelmytickets()
	{
		if(a==null)
		{
			System.out.println("You dide'nt book any tickets");
		}
		else
		{
			a=null;
			System.out.println("Your tickets is canceled");
		}
	}
	
	public void displaytickets()
	{
		if(a==null)
		{
			System.out.println("You dide'nt book any tickets");
		}
		else
		{
			if(a instanceof AirIndia)
			{
				AirIndia m=(AirIndia)a;
				System.out.println("name="+m.name);
				System.out.println("age="+m.age);
				System.out.println("gender="+m.gender);
				System.out.println("mobileno="+m.mbno);
				System.out.println("adharno="+m.adharno);
				System.out.println("vactinated="+m.vacinated);
				System.out.println("from="+m.from);
				System.out.println("to="+m.to);
				System.out.println("date="+m.date);
				System.out.println("km="+m.km);
				System.out.println("price="+m.km*m.price);
			}
			else if(a instanceof AirAsia)
			{
					AirAsia m=(AirAsia)a;
					System.out.println("name="+m.name);
					System.out.println("age="+m.age);
					System.out.println("gender="+m.gender);
					System.out.println("mobileno="+m.mbno);
					System.out.println("adharno="+m.adharno);
					System.out.println("vactinated="+m.vacinated);
					System.out.println("from="+m.from);
					System.out.println("to="+m.to);
					System.out.println("date="+m.date);
					System.out.println("km="+m.km);
					System.out.println("price="+m.km*m.price);
			}
			else if(a instanceof Indigo)
			{
					Indigo m=(Indigo)a;
					System.out.println("name="+m.name);
					System.out.println("age="+m.age);
					System.out.println("gender="+m.gender);
					System.out.println("mobileno="+m.mbno);
					System.out.println("adharno="+m.adharno);
					System.out.println("vactinated="+m.vacinated);
					System.out.println("from="+m.from);
					System.out.println("to="+m.to);
					System.out.println("date="+m.date);
					System.out.println("km="+m.km);
					System.out.println("price="+m.km*m.price);
			}	
		}
	}
	
	public void Changedate()
	{
		if(u==null)
		{
			System.out.println("You have to login first");
		}
		else
		{
			if(a==null)
			{
				System.out.println("You dide'nt book any tickets");
			}
			else
			{
				if(a instanceof AirIndia)
				{
					AirIndia d=(AirIndia)a;
					System.out.println("enter new date");
					d.date=sc.next();
					System.out.println("date change successfully");
				}
				else if(a instanceof AirAsia)
				{
					AirAsia d=(AirAsia)a;
					System.out.println("enter new date");
					d.date=sc.next();
					System.out.println("date change successfully");
				}
				else if(a instanceof Indigo)
				{
					Indigo d=(Indigo)a;
					System.out.println("enter new date");
					d.date=sc.next();
					System.out.println("date change successfully");
				}
			}
		}
	}
	
	public void Makepayement()
	{
		if(u==null)
		{
			System.out.println("You have to Login");
		}
		else
		{
			if(a==null)
			{
				System.out.println("You dide'nt book any tickets");
			}
			else
			{
				if(a instanceof AirIndia)
				{
					AirIndia p=(AirIndia)a;
					System.out.println("You have to pay="+p.km*p.price);
					System.out.println("enter amount");
					double pay=sc.nextDouble();
					if(pay>=p.km*p.price)
					{
						System.out.println("payement successful.Thank you to travling with AirIndia.");
					}
					else
					{
						System.out.println("payement failed");
					}
				}
				else if(a instanceof AirAsia)
				{
					AirAsia p=(AirAsia)a;
					System.out.println("You have to pay="+p.km*p.price);
					System.out.println("enter amount");
					double pay=sc.nextDouble();
					if(pay>=p.km*p.price)
					{
						System.out.println("payement successful.Thank you to travling with AirIndia.");
					}
					else
					{
						System.out.println("payement failed");
					}
				}
				else if(a instanceof Indigo)
				{
					Indigo p=(Indigo)a;
					System.out.println("You have to pay="+p.km*p.price);
					System.out.println("enter amount");
					double pay=sc.nextDouble();
					if(pay>=p.km*p.price)
					{
						System.out.println("payement successful.Thank you to travling with AirIndia.");
					}
					else
					{
						System.out.println("payement failed");
					}
				}
			}
		}
	}
	
	public void Logout()
	{
		if(u==null)
		{
			System.out.println("Your are not login");
		}
		else
		{
			u=null;
			System.out.println("Logout successfully");
		}
	}
}
