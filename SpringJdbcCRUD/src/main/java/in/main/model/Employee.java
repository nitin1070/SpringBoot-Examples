package in.main.model;

public class Employee {
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal;
	}
	public Employee() {
		
	}
	public int getId() {
		return id;
	}
	public Employee(int id, String name, String dept, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private int id;
	private String name;
	private String dept;
	private int sal;

}
