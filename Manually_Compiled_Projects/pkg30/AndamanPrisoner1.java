import java.util.ArrayList;

public class AndamanPrisoner1{
    public static void main(String[] args) {
        ArrayList<String> prisons = new ArrayList<>(); 
        for(int i = 0; i < 10; i++) {
            prisons.add("C");
        }
        for(int i = 0; i < 10; i++) {
            prisons.set(i, "O");            
        }
        for(int i = 1; i < 10; i+=2) {
            prisons.set(i, "C");
        }
        for(int i = 2; i < 10; i+=3) {
            if(prisons.get(i) == "O"){
                prisons.set(i, "C");
            }else{
                prisons.set(i, "O");
            }
        }
        System.out.println(prisons);
    }
}
