package firstexample;

public class example extends SingleInhertiParent implements Interface1{
	public void print_ParentDetails(String name1,String name2)
	{
		System.out.println("FatherName: "+name1);
		System.out.println("MotherName: "+name2);
	}
	public static void main(String[] args) {
example obj=new example();
		obj.print_StudentDetails();
		obj.print_ParentDetails("Rajender","Tamilselvi");
		
		
	}

}
