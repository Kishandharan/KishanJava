package pkg4;

import java.util.Scanner;

public class K1 {
    public static void main(String[] args) {
        Shape sh1 = new BoxSurface();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Width: ");
        int wid1 = sc1.nextInt();
        sh1.width = wid1;
        sh1.length = sh1.width/2;
        sh1.height = 2*(sh1.width+sh1.length);
        sh1.calcBoxSurface();
        // Length = wid/2
        // Height = 2*(len+wid)
    }
}

abstract class Shape{
    public int length;
    public int width;
    public int height;
    public abstract void calcBoxSurface();
}

class BoxSurface extends Shape{
    public void calcBoxSurface(){
        double result = 2*(length+width+height);
        System.out.println(result);
    }
}