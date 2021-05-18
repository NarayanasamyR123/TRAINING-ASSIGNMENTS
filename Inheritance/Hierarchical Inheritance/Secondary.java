package firstexample;

public class Secondary extends School{
	private String division;
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public int stucount;
	public int getStucount() {
		return stucount;
	}
	public void setStucount(int stucount) {
		this.stucount = stucount;
	}
	protected int fees;
	protected int getFees() {
		return fees;
	}
	protected void setFees(int fees) {
		this.fees = fees;
	}
	public void displaysecondary()
	{
		Secondary obj=new Secondary();
		System.out.println("School No: "+schoolno+" "+"City: "+city+" "+obj.getSchoolname());
		System.out.println("Division: "+division+" "+"Fees: "+fees+" "+"Student count: "+stucount);
	}

}
