package in.sca.beans;

public class Desktop implements Computer {

	public String getDeskname() {
		return deskname;
	}

	public void setDeskname(String deskname) {
		System.out.println("Desktop set...");
		this.deskname = deskname;
	}

	private String deskname;

	@Override
	public boolean start() {
		System.out.println("Desktop started...");
		return true;
	}
	
}
