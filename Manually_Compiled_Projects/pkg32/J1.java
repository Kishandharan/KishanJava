import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class J1{
    public static void main(String[] args) {
         Random rd1 = new Random();
         ArrayList<String> list1 = new ArrayList<>(
            Arrays.asList(
                "a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z",
                "A","B","C","D","E","F","G","H","I","J","K","L","M",
                "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                "0","1","2","3","4","5","6","7","8","9",
                "!","@","#","$","%","^","&","*","(",")"
            )
        );


        String pwd = "";
        String chr = "";
        int rdn = 0;

        for(int i = 0; i < 10; i++) {
            rdn = rd1.nextInt(0, list1.size());
            chr = list1.get(rdn);
            pwd += chr;
        }        

        System.out.println(pwd);
    }
}
