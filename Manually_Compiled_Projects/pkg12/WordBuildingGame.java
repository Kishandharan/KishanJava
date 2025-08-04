package pkg12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WordBuildingGame {
	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("dictionary.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		String userChoice = "";
		String compChoice = "";
		Random rand1 = new Random();
		int randnum;
		char lastletter = ' ';
		ArrayList<String>filtered_words = new ArrayList<>();
		ArrayList<String>words = new ArrayList<>();
		while(sc1.hasNextLine()) {
			String word = sc1.nextLine().replace("\n", "");
			words.add(word);
		}		
		
		userChoice = sc2.nextLine();
		lastletter = userChoice.charAt(userChoice.length()-1);
		for(int i = 0; i<words.size(); i++) {
			if(words.get(i).startsWith(String.valueOf(lastletter))) {
				filtered_words.add(words.get(i));												
			}
		}
		randnum = rand1.nextInt(filtered_words.size());	
		compChoice = filtered_words.get(randnum);
		System.out.println(compChoice);
	}
}
