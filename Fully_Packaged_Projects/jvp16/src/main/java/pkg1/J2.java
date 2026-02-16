package pkg1;

public class J2 {
    public static void checkIfPalindrome(String str1){
        int len1 = str1.length();
        char c1;
        char c2;
        boolean isPalindrome = true;

        if(len1%2 == 0){
            isPalindrome = false;
        }else{
            for(int i=0; i<(len1/2)+1; i++){
                c1 = str1.toLowerCase().charAt(i);
                c2 = str1.toLowerCase().charAt(len1-(i+1));
                if(c1 != c2){
                    isPalindrome=false;
                }
                //System.out.println(c1+"-"+c2+" "+isPalindrome);
            }
        }
        if(isPalindrome){
            System.out.println(str1+" is a Palindrome");
        }
    }
    public static void main(String[] args){
        checkIfPalindrome("smalayalams");
        checkIfPalindrome("madam");
        checkIfPalindrome("Madam");
        checkIfPalindrome("madams");
    }
}
