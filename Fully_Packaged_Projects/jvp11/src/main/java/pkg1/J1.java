package pkg1;

public class J1 {
    public static void main(String[] args) {
        String str1 = "Pranathi";
        String str2 = "";
        for(int i = 0; i < str1.length() ; i++){ str2 += " ";  }

        for(int i = 1; i < str1.length(); i++) {
            System.out.println(str2.substring(0,str1.length()-i)+str1.substring(0, i));
        }
        System.out.println(str1);
        for(int i = 1; i < str1.length(); i++) {
            System.out.println(str2.substring(0,i)+str1.substring(0, str1.length()-i));
        }
    }
}
