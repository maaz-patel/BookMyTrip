package BookMyTrip.com;

public class AirIndia extends Airlines
{
	String name;
	int age;
	char gender;
	long mbno;
	long adharno;
	int vacinated;
	double price=300;
	
	AirIndia( String name,int age,char gender,long mbno,long adharno,int vacinated)
	{	
		super();
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.mbno=mbno;
		this.adharno=adharno;
		this.vacinated=vacinated;
	}
}
