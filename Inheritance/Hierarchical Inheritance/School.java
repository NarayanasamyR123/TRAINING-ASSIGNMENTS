package firstexample;

public class School {
	private String schoolname;
	protected int schoolno;
	public String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	protected int getSchoolno() {
		return schoolno;
	}

	protected void setSchoolno(int schoolno) {
		this.schoolno = schoolno;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	
	

}
