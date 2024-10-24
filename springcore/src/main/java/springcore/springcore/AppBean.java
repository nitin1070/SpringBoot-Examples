package springcore.springcore;

public class AppBean {
	
	private String name;
	private int age;
	

	public AppBean(String name, int age) {
		
		this.name=name;
		this.age=age;
		
		System.out.println("Name is :"+name+"\r\nAge is :"+age);
	}
	
	
	
	
}
