package pkg1;

import java.util.ArrayList;
import java.util.List;

public class C2 {
    public static void main(String[] args){
        List<Character> prisons = new ArrayList<>();
        List<Integer> lucky = new ArrayList<>();
        int count1 = 10;
        for(int i = 0; i<count1; i++){
            prisons.add('C');
        }

        for(int i=0; i<count1; i++){
           prisons.set(i, 'O');
        }

        for(int i=1; i<count1; i+=2){
            prisons.set(i, 'C');
        }

        for(int j=2; j<count1; j++){
            for(int i=j; i<count1; i+=j+1){
                if(prisons.get(i) == 'O'){
                    prisons.set(i, 'C');
                }else{
                    prisons.set(i, 'O');
                }
            }
        }

        for(int i=0; i<count1; i++){
            if(prisons.get(i) == 'O'){
                lucky.add(i+1);
            }
        }

        System.out.println(lucky+" are the lucky ones");
    }
}