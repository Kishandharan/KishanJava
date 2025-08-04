package pkg17;
import java.util.ArrayList;
import java.util.Collections;

public class Leader1 {
    public static void main(String[] args){
        ArrayList<Integer>leaders = new ArrayList<>();
        int[] arr1 = {7, 17, 9, 2, 8, 3};
        int lcn;
        lcn = arr1[arr1.length-1];

        leaders.add(lcn);
        for(int i = arr1.length-2; i >= 0; i--) {
            if(arr1[i] >= lcn) {
                leaders.add(arr1[i]);
                lcn = arr1[i];
            }
        }
        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}
