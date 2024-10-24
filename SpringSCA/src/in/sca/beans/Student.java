package in.sca.beans;

public class Student {
	
	
	public Student ()
	{
		
		System.out.println("student bean created...");
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int rollno;
	private String name;
	

}
