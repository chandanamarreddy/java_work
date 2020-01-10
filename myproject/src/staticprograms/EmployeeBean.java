package staticprograms;

public class EmployeeBean {
	int eno;
	String name;
	static double salary;
	
	public EmployeeBean(int eno, String name) {
		this.eno=eno;
		this.name=name;	
	}
	public void print() {
		System.out.println("Eno=" +eno);
		System.out.println("name=" +name);
		System.out.println("Salary="+salary);
		
	}

}
