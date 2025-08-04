package pkg19;

public class NestedClasses {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = new Outer.Inner();
        System.out.println(outer.a);
        System.out.println(inner.b);
    }
}

class Outer{
    int a = 10;
    static class Inner{
        int b = 60;
    }
}
