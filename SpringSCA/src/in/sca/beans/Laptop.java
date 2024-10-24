package in.sca.beans;

public class Laptop implements Computer {
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("Laptop brand name set...");
		this.brand = brand;
	}

	public String brand;

	@Override
	public boolean start() {
		System.out.println("Laptop started");
		return true;
	}
	

}
