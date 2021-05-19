package firstexample;

public class example extends SingleInhertiParent implements Interface1,Interface2{
	public void disp()
	{
		System.out.println("The dispalyed details are");
	}
public static void main(String[] args) {
example obj=new example();
		obj.disp();
		obj.print_StudentDetails();
		
		
	}

}

