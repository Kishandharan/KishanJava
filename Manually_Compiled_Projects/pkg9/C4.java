package pkg9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class C4 {
	public static void genpwd(int size) {
		
		Random rand1 = new Random();
		ArrayList<String>cap_letters = new ArrayList<>();
		ArrayList<String>small_letters = new ArrayList<>();
		ArrayList<String>nums = new ArrayList<>();
		ArrayList<String>allChars = new ArrayList<>();
		String pwd = "";
		for(int i = 0; i <= 9; i++) {
			nums.add(String.valueOf(i));
		}
		for(int i = 65; i < 90; i++) {
			cap_letters.add(String.valueOf((char)i));						
		}
		for(int i = 97; i < 122; i++) {
			small_letters.add(String.valueOf((char)i));
		}
		allChars.addAll(small_letters);
		allChars.addAll(cap_letters);
		allChars.addAll(nums);
		Collections.shuffle(allChars);
		
		for(int i = 0; i < size; i++) {
			int rand2 = rand1.nextInt(allChars.size());
			pwd += allChars.get(rand2);
		}
		System.out.println("Your password - "+pwd);
		
	}
	public static void main(String[] args) {
		genpwd(3);		
	}
}
