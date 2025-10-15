import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class J1{
    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<>();                
        arraylist1.add(1);
        arraylist1.add(6);
        int max1 = Collections.max(arraylist1);
        System.out.println(max1);
    }
}
