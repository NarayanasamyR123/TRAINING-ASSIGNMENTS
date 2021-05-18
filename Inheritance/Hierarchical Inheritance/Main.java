package firstexample;
public class example {

	public static void main(String[] args) {
HigherSecondary objnew=new HigherSecondary();
		Secondary objnew1=new Secondary();
		objnew.setSchoolno(200);
		objnew.setSchoolname("k.s.r");
		objnew.setCity("namakkal");
		objnew.setDivision("higher");
		objnew.setFees(40000);
		objnew.setStucount(100);
		objnew.displayHigher();
		objnew1.setSchoolno(400);
		objnew1.setSchoolname("k.s.r");
		objnew1.setCity("salem");
		objnew1.setDivision("secondary");
		objnew1.setFees(20000);
		objnew1.setStucount(500);
		objnew1.displaysecondary();
	}

}