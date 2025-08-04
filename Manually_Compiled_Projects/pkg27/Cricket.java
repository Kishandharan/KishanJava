package pkg1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cricket {
	int score;
	String player;
	public Cricket() {}
	public Cricket(int score, String player){
		this.score = score;
		this.player = player;
	}
	
	String[] getData() {
		String[] arr1 = new String[2];
		arr1[0] = String.valueOf(score);
		arr1[1] = player;
		return arr1;
	}
	
	List<Cricket> loadFile(String fname)throws IOException{
		File f1 = new File(fname);
		Scanner sc1 = new Scanner(f1);
		List<Cricket> list1 = new ArrayList<>();
		sc1.nextLine();
		while(sc1.hasNextLine()) {
			String[] arr1 = sc1.nextLine().split(",");
			int run = Integer.parseInt(arr1[8]);
			String name = arr1[5];
			list1.add(new Cricket(run, name));
		}
		
		sc1.close();
		
		return list1;
	}
}
