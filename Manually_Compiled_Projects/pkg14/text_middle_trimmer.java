package pkg14;
import java.util.Scanner;

public class text_middle_trimmer {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String str1;
        String tt1;
        String[] arr1;

        System.out.println("Enter something: ");
        str1 = sc1.nextLine();
        arr1 = str1.split(" ");

        if(arr1.length > 2) {
            tt1 = arr1[0] + " " + arr1[1] + "..." + arr1[arr1.length-1];
        } else {
            tt1 = str1;
        }

        System.out.println(tt1);
    }
}
