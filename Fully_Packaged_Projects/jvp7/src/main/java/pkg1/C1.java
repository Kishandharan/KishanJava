package pkg1;

import java.util.Scanner;

public class C1 {
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        System.out.print("StartNum>> ");
        int num1 = sc1.nextInt();

        System.out.print("StopNum>> ");
        int num2 = sc1.nextInt();

        for(int j = num1; j <= num2; j++){
            for(int i = 1; i <= 10; i++){
                System.out.println(j+"*"+i+"="+i*j);
            }

            System.out.println();
        }
    }
}
