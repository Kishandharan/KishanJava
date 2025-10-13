import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class GoldMedal{
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Integer> engMarks = new ArrayList<>();                 
        ArrayList<Integer> matMarks = new ArrayList<>();                 
        ArrayList<Integer> phyMarks = new ArrayList<>();                 
        ArrayList<Integer> cheMarks = new ArrayList<>();                 
        ArrayList<Integer> bioMarks = new ArrayList<>();                 
        ArrayList<String> studNames = new ArrayList<>();
        File f1 = new File("marks.txt");
        Scanner sc1 = new Scanner(f1);

        while(sc1.hasNextLine()){
            String line = sc1.nextLine();          
            String[] arr1 = line.split(",");
            int engMark = Integer.parseInt(arr1[3].split(":")[1]);
            int matMark = Integer.parseInt(arr1[4].split(":")[1]);
            int phyMark = Integer.parseInt(arr1[5].split(":")[1]);
            int cheMark = Integer.parseInt(arr1[6].split(":")[1]);
            int bioMark = Integer.parseInt(arr1[7].split(":")[1]);
            engMarks.add(engMark);
            matMarks.add(matMark);
            phyMarks.add(phyMark);
            cheMarks.add(cheMark);
            bioMarks.add(bioMark);
        }

        System.out.println(engMarks);
        System.out.println(matMarks);
        System.out.println(phyMarks);
        System.out.println(cheMarks);
        System.out.println(bioMarks);
    }
}
