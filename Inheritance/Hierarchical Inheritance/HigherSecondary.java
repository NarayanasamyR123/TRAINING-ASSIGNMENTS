package firstexample;

public class HigherSecondary extends School{
	private String division;
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	protected int fees;
	protected int getFees() {
		return fees;
	}
	protected void setFees(int fees) {
		this.fees = fees;
	}
	public int stucount;
	public int getStucount() {
		return stucount;
	}
	public void setStucount(int stucount) {
		this.stucount = stucount;
	}
	public void displayHigher()
	{
		HigherSecondary obj=new HigherSecondary();
		System.out.println("Student count: "+stucount+" "+"Fees: "+fees+" "+"Division: "+division);
		System.out.println("School No: "+schoolno+" "+"City: "+city+" "+"School Name: "+obj.getSchoolname());
	}
	

}
