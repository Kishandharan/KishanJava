package pkg1;

import java.util.ArrayList;
import java.util.List;

public class C2 {
    public static void main(String[] args){
        List<Character> prisons = new ArrayList<>();
        int count1 = 10;
        for(int i = 0; i<count1; i++){
            prisons.add('C');
        }
        System.out.println("Opening: "+prisons);

        for(int i=0; i<count1; i++){
           prisons.set(i, 'O');
        }
        System.out.println("Round 1: "+prisons);

        for(int i=1; i<count1; i+=2){
            prisons.set(i, 'C');
        }
        System.out.println("Round 2: "+prisons);

        for(int j=2; j<5; j++){
            for(int i=j; i<count1; i+=j+1){
                if(prisons.get(i) == 'O'){
                    prisons.set(i, 'C');
                }else{
                    prisons.set(i, 'O');
                }
            }
            System.out.println("Round "+(j+1)+": "+prisons);
        }
    }
}
