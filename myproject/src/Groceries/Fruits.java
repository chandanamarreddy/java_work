package Groceries;

public class Fruits {
	private int id;
	private String type;
	private String qty;
	private double price;
	
	public Fruits() {
		
	}

	public Fruits(int id, String type, String qty, double price) {
		super();
		this.id = id;
		this.type = type;
		this.qty = qty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
		
}
