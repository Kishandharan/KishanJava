package pkg1;

import java.util.Scanner;

public class CtoF {
	
	public static int ctof() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter temp in celsius: ");
		int celsius = sc1.nextInt();
		int farenheit = (celsius*9/5) + 32;
		return (farenheit);		
	}
	
	public static void main(String[] args) {
		System.out.println(ctof());		
	}
}
