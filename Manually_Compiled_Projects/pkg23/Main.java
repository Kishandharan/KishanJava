package ba.pkg1;

public class Main {
	public static void main(String[] args) throws InsufficientFundException{
		BankApplication ba1 = new BankApplication(2, 1000);
		System.out.println("Initial balance - "+ba1.getBalance());
		ba1.deposit(100);
		System.out.println("Balance after deposit - "+ba1.getBalance());
		ba1.withdraw(2000);
	}
}
