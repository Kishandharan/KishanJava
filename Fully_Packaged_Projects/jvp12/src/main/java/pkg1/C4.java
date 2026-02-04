package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C4 {
    public static void main(String[] args) throws FileNotFoundException{
        System.out.println("Gold Medal and Toppers");
        File f1 = new File("Marks.txt");
        Scanner sc1 = new Scanner(f1);
        List<String> names = new ArrayList<>();

        List<Integer> engMarks = new ArrayList<>();
        List<Integer> matMarks = new ArrayList<>();
        List<Integer> phyMarks = new ArrayList<>();

        List<String> engToppers = new ArrayList<>();
        List<String> matToppers = new ArrayList<>();
        List<String> phyToppers = new ArrayList<>();

        String s1 = "";
        String[] arr1;
        String[] arr2;

        int engMax = 0;
        int matMax = 0;
        int phyMax = 0;

        while(sc1.hasNext()){
            s1 = sc1.nextLine();
            arr1 = s1.split(",");
            names.add(arr1[0]);

            arr2 = arr1[3].split(":");
            engMarks.add(Integer.parseInt(arr2[1]));

            arr2 = arr1[4].split(":");
            matMarks.add(Integer.parseInt(arr2[1]));

            arr2 = arr1[5].split(":");
            phyMarks.add(Integer.parseInt(arr2[1]));
        }

        engMax = Collections.max(engMarks);
        matMax = Collections.max(matMarks);
        phyMax = Collections.max(phyMarks);

        for(int i = 0; i < engMarks.size(); i++){
            if(engMarks.get(i) == engMax){
                engToppers.add(names.get(i));
            }
            if(matMarks.get(i) == matMax){
                matToppers.add(names.get(i));
            }
            if(phyMarks.get(i) == phyMax){
                phyToppers.add(names.get(i));
            }
        }

        System.out.println(engToppers+" are the toppers in English with marks "+engMax);
        System.out.println(matToppers+" are the toppers in Maths with marks "+matMax);
        System.out.println(phyToppers+" are the toppers in Physics with marks "+phyMax);
    }
}
