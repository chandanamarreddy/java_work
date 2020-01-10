package polymorphism;

public class PaymentBean {
	public static void main(String[] args) {
		ProcessPayment pp = new ProcessPayment();
		pp.Process(new ApplePay(), 2000);
	}
}
