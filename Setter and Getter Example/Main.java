package firstexample;

public class Main {

	public static void main(String[] args) {
ChildClass1 obj=new ChildClass1();
		obj.setSchoolname("K.S.R");
		obj.setSchoolno(100);
		obj.setSchoolowner("Rangasamy");
		obj.setSchoolphno(883828);
		obj.setStu_name("Narayanasamy");
		obj.setAddress("Edappadi");
		obj.setStu_rollno(1614157);
		obj.setClass_no(100);
		System.out.println(obj.getSchoolname()+"\n"+obj.getSchoolno()+"\n"+obj.getSchoolowner()+"\n"+obj.getSchoolphno());
		System.out.println(obj.getStu_name()+"\n"+obj.getAddress()+"\n"+obj.getStu_rollno()+"\n"+obj.getClass_no());
	}

}
