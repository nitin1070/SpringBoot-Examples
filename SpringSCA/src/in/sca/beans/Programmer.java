package in.sca.beans;

public class Programmer{
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	private String name;
private Computer computer;

public void writeCode() {
	
	boolean  res = computer.start();
	if(res) {
		
		System.out.println("writing code...");
	}
	else {
		System.out.println("could not start");
	}
	
}
	

}
