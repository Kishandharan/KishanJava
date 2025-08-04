package pkg1;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter firstname : ");
		String name1 = sc1.nextLine();
		System.out.print("Enter lastname : ");
		String name2 = sc1.nextLine();
		System.out.print("Enter email : ");
		String email = sc1.nextLine();
		System.out.print("Enter mobile number : ");
		long tel = sc2.nextLong();
		System.out.print("Enter Aadhaar number : ");
		long aadhaar = sc2.nextLong();
		System.out.print("Enter pincode of your address : ");
		int pincode = sc2.nextInt();
		System.out.println();
		
		System.out.println("Dear "+name1+name2+","+"congrats on opening a ICICI account in the email "+email+" and with pincode of "+pincode);
		sc1.close();
		sc2.close();
		
	}
}
