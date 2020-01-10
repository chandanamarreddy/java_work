package polymorphism;

public class ProcessPayment {
	public void Process(Payment p, int amount) {
		p.PayBill(amount);
		
	}	
}
