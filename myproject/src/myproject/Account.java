package myproject;

public class Account {
	int acno;
	String name;
	static float rate;
	
	public Account(int acno, String name) {
		this.acno= acno;
		this.name=name;
		rate=3.4f;
	}
	public void print() {
		System.out.println("Acno=" +acno);
		System.out.println("Name="+name);
		System.out.println("Rate="+rate);
		
		
	}
	

}
