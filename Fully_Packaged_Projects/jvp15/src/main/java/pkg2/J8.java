package pkg2;

public class J8 {
    public static void main(String[] args){
        String str1 = "Funwith";
        String space = "-";
        String str2 = "";
        String part1 = "";
        String part2 = "";
        int len1 = str1.length();

        for(int j = 1; j<len1+1; j++){
            part1="";
            part2="";
            for(int i = 0; i<len1-j; i++){
                part1 = part1 + space;
            }
            part2 = str1.substring(0,j)+"\n";
            str2 += part1+part2;
        }

        part1 = "";
        for(int i = 0; i<1; i++){
            part1 += space;
        }
        part2 = "Funwit" + "\n";
        str2 += part1 + part2;

        part1 = "";
        for(int i = 0; i<2; i++){
            part1 += space;
        }
        part2 = "Funwi" + "\n";
        str2 += part1 + part2;

        part1 = "";
        for(int i = 0; i<3; i++){
            part1 += space;
        }
        part2 = "Funw" + "\n";
        str2 += part1 + part2;

        System.out.println(str2);
    }
}
