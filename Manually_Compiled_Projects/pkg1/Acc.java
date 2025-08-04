package pkg1;

class BankAccount{
	static long balance;
	
	BankAccount(long balance){
		BankAccount.balance = balance;		
	}
	
	public void deposit(long amount) {
		balance += amount;
		System.out.println("You have deposited RS. "+amount+" to the bank");
	}
	
	public void withdraw(long amount) {
		if(amount > balance) {
			System.out.println("The amount that you are trying to withdraw is greater than the amount that is left in the bank");
		}else {
			System.out.println("You have withdrawn RS. "+amount+" from the bank");
			balance-=amount;
		}
	}
}

public class Acc {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(100000);
		ba1.withdraw(10);
		System.out.println(ba1.balance);
		ba1.deposit(1000000000);
		System.out.println(ba1.balance);
	}
}
