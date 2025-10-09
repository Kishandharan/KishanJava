import java.util.ArrayList;

public class AndamanPrisoner1{
    public static void main(String[] args) {
        ArrayList<String> prisons = new ArrayList<>(); 
        ArrayList<Integer> lucky = new ArrayList<>();
        int count = 1000;

        for(int i = 0; i < count; i++) {
            prisons.add("C");
        }
        for(int i = 0; i < count; i++) {
            prisons.set(i, "O");            
        }
        for(int i = 1; i < count; i+=2) {
            prisons.set(i, "C");
        }
        for(int j=2; j<count; j++) {
            for(int i=j; i<count; i+=j+1) {
                if(prisons.get(i) == "O"){
                    prisons.set(i, "C");
                }else{
                    prisons.set(i, "O");
                }
            }
        }

        for(int i=0; i<count; i++){
            if(prisons.get(i) == "O"){
                lucky.add(i+1);
            }
        }
        System.out.println(lucky+" are the lucky prisoners");
    }
}
