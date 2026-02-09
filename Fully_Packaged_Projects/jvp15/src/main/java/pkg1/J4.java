package pkg1;

public class J4 {
    public static String diamond1(String str1){
        String str2 = "";
        int len1 = str1.length();

        for(int i = 1; i<len1+1; i++){
            str2 += str1.substring(0,i)+"\n";
        }

        for(int i = 1; i<len1; i++){
            str2 += str1.substring(0,len1-i)+"\n";
        }

        return str2;
    }
    public static void main(String[] args){
        String result = diamond1("Funwith");
        System.out.println(result);
    }
}
