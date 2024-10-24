package sca.springbatchex2;

public class Programmer{   
	private LapTop lt;
	public boolean writeCode() {
		  lt= new LapTop();
		   lt.start();
	     System.out.println("writing code...");
	     return true;
	}

}
