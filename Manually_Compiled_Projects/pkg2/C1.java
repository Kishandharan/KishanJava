package pkg2;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class C1{
	public static void main(String[] args)throws IOException{
		File f1 = new File("2025.txt");
		FileWriter fw1 = new FileWriter("2025_print.txt");
		Scanner sc1 = new Scanner(f1);
		String s1;
		String s2;
		String[] line1 = null;
		List<String> months1 = new ArrayList<>();
		List<Integer> days1 = new ArrayList<>();
 		for(int i=0; i<12; i++){
 			s2 = sc1.nextLine();
			line1 = s2.split(",");
			months1.add(line1[0]);
			days1.add(Integer.parseInt(line1[1]));
 		}
		for(int j=0; j<months1.size(); j++){
			for(int i=1; i<=days1.get(j); i++){
			    s1 = months1.get(j)+" "+i;
                System.out.println(s1);
                fw1.write(s1+"\n");
            }
            System.out.println();
            fw1.write("\n");
		}
		fw1.close();
	}
}