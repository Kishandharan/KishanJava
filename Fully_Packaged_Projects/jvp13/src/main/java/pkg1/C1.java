package pkg1;

import java.util.ArrayList;
import java.util.List;

public class C1 {
    public static void main(String[] args){
        List<String> prisons = new ArrayList<>();
        int count1 = 10;
        for(int i = 0; i<count1; i++){
            prisons.add("C");
        }
        System.out.println("Opening: "+prisons);

        for(int i=0; i<count1; i++){
           prisons.set(i, "O");
        }
        System.out.println("Round1:  "+prisons);

        for(int i=1; i<count1; i+=2){
            prisons.set(i, "C");
        }
        System.out.println("Round2:  "+prisons);
    }
}
