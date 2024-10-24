package in.sca.beans;

public class Student {
	
	public Student() {
		
		System.out.println("Student bean created...");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setting name ...");
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		System.out.println("setting roll ...");
		this.rollno = rollno;
	}
	private String name;
	private String rollno ;
	
}
