package JDBC;

public class Employee {
	private int eno;
	private String name;
	private String gender;
	private double sal;
	
	public Employee() {
		
	}

	public Employee(int eno, String name, String gender, double sal) {
		super();
		this.eno = eno;
		this.name = name;
		this.gender = gender;
		this.sal = sal;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	

}
