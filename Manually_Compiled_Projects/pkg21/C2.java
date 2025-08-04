import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C2{
	public static void main(String[] args) {
		Map<Integer, String>map1 = new HashMap<>();
		Scanner sc1 = new Scanner(System.in);
		map1.put(1,"one");
		map1.put(2,"two");	
		map1.put(3, "three");
		map1.put(4, "four");
		map1.put(5, "five");
		map1.put(6, "six");
		map1.put(7, "seven");
		map1.put(8, "eight");
		map1.put(9, "nine");
		map1.put(10, "ten");
		map1.put(11, "eleven");
		map1.put(12, "twelve");
		map1.put(13, "thirteen");
		map1.put(14, "fourteen");
		map1.put(15, "fifteen");
		map1.put(16, "sixteen");
		map1.put(17, "seventeen");
		map1.put(18, "eighteen");
		map1.put(19, "nineteen");
		map1.put(20, "twenty");
		map1.put(30, "thirty");
		map1.put(40, "forty");
		map1.put(50, "fifty");
		map1.put(60, "sixty");
		map1.put(70, "seventy");
		map1.put(80, "eighty");
		map1.put(90, "ninety");
		System.out.print("Enter: ");
		int userinput = sc1.nextInt();
		int quotient = (userinput/10);
		int part1 = quotient*10;
		int part2 = userinput-part1;
		System.out.println(map1.get(part1)+" "+map1.get(part2));
	}
}