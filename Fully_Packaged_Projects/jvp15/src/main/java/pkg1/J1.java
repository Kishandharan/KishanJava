package pkg1;

public class J1 {
    public static void main(String[] args){
        String str1 = "FunwithProgramming";
        String str2 = "";

        for(int i = 1; i<str1.length()+1; i++){
            str2 += str1.substring(0,i)+"\n";
        }
        System.out.println(str2);

    }
}
