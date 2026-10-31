//11. Payment System: A payment application supports UPI, CreditCard, and Cash payments.
//Design a common Payment interface with pay(double amount). 
//Explain how each payment class can provide its own implementation and how runtime polymorphism is achieved.


package javatest;

public class Payment {
	void pay() {
		System.out.println("payment class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cashpayment obj=new Cashpayment();
		Creditcard obj2=new Creditcard();
		Upi obj3=new Upi();
		obj.pay();
		obj2.pay();
		obj3.pay();

	}

}
class Upi extends Payment{
	void pay() {
		System.out.println("upi class");
	}
}
class Creditcard extends Upi{
	void pay() {
		System.out.println("Creditcard class");
	}
}
class Cashpayment extends Creditcard{
	void pay() {
		System.out.println("Cashpayment class");
	}
}