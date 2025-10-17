package pkg1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class J1 {
    public static void main(String[] args) {
        ArrayList<String> arrlist1 = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","p","q","r","s","t","u","v","w","x","y","z","!","@","#","$","%","^","&","*","(",")"));
        Random r1 = new Random();
        String pwd = "";

        for(int i = 0; i<10000; i++){
            pwd += arrlist1.get(r1.nextInt(arrlist1.size()));
        }

        System.out.println(pwd);

    }
}
