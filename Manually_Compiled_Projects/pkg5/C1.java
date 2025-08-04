package pkg5;

public class C1 {
    public static void main(String[] args){
        Human human1 = new Man();
        Human human2 = new Woman();

        human1.run();
        human1.walk();
        human1.speak();

        human1.run();
        human1.walk();
        human1.speak();
    }
}

interface Human{
    void speak();
    void run();
    void walk();
}

class Man implements Human{
    public void speak(){
        System.out.println("I am speaking");
    }
    public void run(){
        System.out.println("I am running");
    }
    public void walk(){
        System.out.println("I am walking");
    }
}

class Woman implements Human{
    public void speak(){
        System.out.println("I am speaking");
    }
    public void run(){
        System.out.println("I am running");
    }
    public void walk(){
        System.out.println("I am walking");
    }
}



