package firstexample;

public class example {

	public static void main(String[] args) {
Grandchild obj11=new Grandchild();
		obj11.setChildname("naveen");
		obj11.setGrandchildname("not yet");
		obj11.setPropertyname("house");
		obj11.setName("rajendran");
		obj11.setPropertyno(101);
		System.out.println(obj11.name+" "+obj11.propertyname+" "+obj11.getPropertyno()+" "+obj11.getChildname()+" "+obj11.getGrandchildname());
		
	}

}
