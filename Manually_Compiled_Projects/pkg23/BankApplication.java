package ba.pkg1;

public class BankApplication {
	private long accountNumber;
	private double balance;
	BankApplication(long accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		balance = balance + amount;		
	}
	
	void withdraw(double amount) throws InsufficientFundException {
		if(amount>balance) {
			throw new InsufficientFundException("Insufficient Funds. Your balance is "+balance+" but you tried to withdraw "+amount);
		}else{
			balance = balance - amount;		
		}
	}
	
	long getAccountNumber() {
		return accountNumber;
	}
	
	double getBalance() {
		return balance;		
	}
}
