package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J4 {
    public static boolean checkIfPalindrome(String str1){
        int len1 = str1.length();
        char c1;
        char c2;
        boolean isPalindrome = true;

        if(len1%2 == 0){
            isPalindrome = false;
        }else{
            for(int i=0; i<(len1/2)+1; i++){
                c1 = str1.toLowerCase().charAt(i);
                c2 = str1.toLowerCase().charAt(len1-(i+1));
                if(c1 != c2){
                    isPalindrome=false;
                }
                //System.out.println(c1+"-"+c2+" "+isPalindrome);
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args)throws FileNotFoundException {
        String str1 = "";
        String result = " is a Palindrome";
        File f1 = new File("in1.txt");
        Scanner sc1 = new Scanner(f1);

        while(sc1.hasNext()){
            str1 = sc1.nextLine();
            if(checkIfPalindrome(str1)){
                System.out.println(str1+result);
            }
        }
    }
}
