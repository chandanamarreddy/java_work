package polymorphism;

public class Payment {
	void PayBill(int amount) {
		System.out.println("pay bill");
	
	}
}
class CreditCard extends Payment{
	void PayBill(int amount) {
		System.out.println("pay credit card bill");
	}
}
class DebittCard extends Payment{
	void PayBill(int amount) {
		System.out.println("pay debit card bill");
	}
}
class Cheque extends Payment{
	void PayBill(int amount) {
		System.out.println("pay cheque bill");
	}
}
class ApplePay extends Payment{
	void PayBill(int amount) {
		System.out.println("pay applepay bill");
	}
}


