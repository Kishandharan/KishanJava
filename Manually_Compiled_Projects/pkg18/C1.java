package pkg18;

public class C1 {
    public static void main(String[] args) throws InterruptedException{
        String str = "This is my text\nthis is another line";
        String[] chars = str.split("");

        for(String ch: chars){
            System.out.print(ch);
            Thread.sleep(200);
        }
    }
}
