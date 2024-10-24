package in.scalive.beans;

public class Customer {
	private String name;
	private int age;
	private Account acc;
	private Address addr;
	
    
    public Customer( Address addr,Account acc) {
    	System.out.println("addr-acc Constructor called");
		this.acc = acc;
		this.addr = addr;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Customer(String name,int age,Account acc,Address addr) {
    	System.out.println("4 param Constructor called");
    	this.name=name;
    	this.age=age;
    	this.acc=acc;
    	this.addr=addr;
    }
	
	
	public void display() {
		System.out.println("Customer Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Account id:"+acc.getAcctid());
		System.out.println("Balance:"+acc.getBal());
		System.out.println("house no:"+addr.getHouseNo());
		System.out.println("City:"+addr.getCity());
	}
    
}
