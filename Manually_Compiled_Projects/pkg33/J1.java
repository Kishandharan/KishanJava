public class J1{
	public static void main(String[] args){
		int a = 5;
		int b = 10;
		
		System.out.println("Hello World!");
		System.out.println(a);
		System.out.println(b);
		greet("Dhyan");
		greet("Ankur");
		greet("Kuthyar");
		greet("Kishan");
	}
	
    public static void greet(String name){
		System.out.println("Hello, "+name);
	}
}