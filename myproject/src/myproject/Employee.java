package myproject;

public class Employee {
	int eno;
	String name;
	double salary;
	void store(int eno, String name, double salary) {
		this.eno=eno;
		this.name=name;
		this.salary= salary;
	}
	void print() {
		System.out.println(eno);
		System.out.println(name);
		System.out.println(salary);
		
		
		
	}
	

}
