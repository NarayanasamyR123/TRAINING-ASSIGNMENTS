package firstexample;

public class ChildClass1 extends Parentclass1{
	private String stu_name;
	protected String address;
	private int stu_rollno;
	public int  class_no;
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getStu_rollno() {
		return stu_rollno;
	}
	public void setStu_rollno(int stu_rollno) {
		this.stu_rollno = stu_rollno;
	}
	public int getClass_no() {
		return class_no;
	}
	public void setClass_no(int class_no) {
		this.class_no = class_no;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}

}
