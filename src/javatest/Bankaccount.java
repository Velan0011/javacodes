
//10. Bank Account: Create a BankAccount class with accountNumber and balance.
//Keep balance protected from direct modification. Add deposit() and withdraw() methods.
//Prevent withdrawal when the amount is greater than the available balance. 
//Identify the OOP concept used.

package javatest;

public class Bankaccount {
    long accountNumber;
    private double balance;
    public void deposit(int amount) {
    	this.balance=this.balance+amount;
    }
    public void withdraw(int amount) {
    	if(amount>this.balance) {
    		System.out.println("there is not enough money in the account");
    	}
    	else {
    		System.out.println("withdrawal successfull");
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bankaccount obj=new Bankaccount();
        obj.deposit(2000);
        obj.withdraw(3000);
	}

}
