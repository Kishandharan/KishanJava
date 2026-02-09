package pkg1;

public class J3 {
    public static void main(String[] args){
        String str1 = "Funwith";
        String str2 = "";
        int len1 = str1.length();

        for(int i = 1; i<len1+1; i++){
            str2 += str1.substring(0,i)+"\n";
        }

        for(int i = 1; i<len1; i++){
            str2 += str1.substring(0,len1-i)+"\n";
        }

        System.out.println(str2);

    }
}
