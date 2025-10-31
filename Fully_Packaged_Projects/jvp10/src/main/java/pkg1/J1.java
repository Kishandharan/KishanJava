package pkg1;

public class J1 {
    public static void main(String[] args) {
        String str1 = "dhyankulal"; // hseena
        String reversed_str1 = "";

        for(int i = str1.length()-1; i > -1; i--){
            reversed_str1 += str1.toCharArray()[i];
        }

        System.out.println(reversed_str1);
    }
}
