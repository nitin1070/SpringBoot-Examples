package in.sca.beans;

public class Car {
	
	private String carName;
	
	public Car() {
		
		System.out.println("Car constructor calling...");
	}
	public void setCarName(String carName) {
		
		this.carName=carName;
	}
	public String getCarName() {
		
		return carName;
	
	}
	public void carStart() {
		
		System.out.println("Car started...");
	}
	
	public void carStop() {
		
		System.out.println("Car stoped...");
	}
	
	public void carDriving() {
		
		System.out.println("car driving...");
	}
			
}
