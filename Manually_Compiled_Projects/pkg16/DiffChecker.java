package pkg16;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiffChecker {
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("text1.txt");
        File f2 = new File("text2.txt");
        Scanner sc1 = new Scanner(f1);
        Scanner sc2 = new Scanner(f2);
        String text1 = "";
        String text2 = "";
        while(sc1.hasNext()){
            text1 += sc1.nextLine();
        }
        while(sc2.hasNext()){
            text2 += sc2.nextLine();
        }
        String[] arr1 = text1.split(" ");
        String[] arr2 = text2.split(" ");

        if(!text1.equals(text2)){
            System.out.println("There are some differences.");
            for(int i=0; i<3; i++){
                if(!arr1[i].equals(arr2[i])){
                    System.out.println(arr1[i]+" - "+arr2[i]);
                }
            }
        }else{
            System.out.println("No differences at all!");
        }
    }
}
