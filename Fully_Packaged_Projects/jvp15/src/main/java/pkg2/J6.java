package pkg2;

public class J6 {
    public static void main(String[] args){
        String str1 = "Funwith";
        String str2 = "";

        str2 += "------"+str1.substring(0,1)+"\n";
        str2 += "-----"+str1.substring(0,2)+"\n";
        str2 += "----"+str1.substring(0,3)+"\n";

        System.out.println(str2);
    }
}
