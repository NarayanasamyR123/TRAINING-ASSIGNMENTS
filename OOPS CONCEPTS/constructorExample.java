package firstexample;

public class Man {
	String name;
	String city;
	int pincode;
	Man()
	{
		System.out.println("This is the man class constrctor");
	}
	Man(String name,String city,int pincode)
	{
		this.name=name;
		this.city=city;
		this.pincode=pincode;
	}
	public void disp_details()
	{
		System.out.println(name);
		System.out.println(city);
		System.out.println(pincode);
		
	}

}
