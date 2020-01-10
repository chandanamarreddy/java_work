package myproject;

class A{
	int x=100;
	
}

class B extends A{
	int y=200;
	
	void print() {
		int z=300;
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		
	}
}

public class demo {
	public static void main(String[] args) {
		
		B obj = new B();
		obj.print();
		
		
	}
}
