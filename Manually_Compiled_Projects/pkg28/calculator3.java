public class calculator3{
    public static void main(String[] args){
        float num1 = 40;
        float num2 = 80;
        String operation = "div";
        float result = 0;

        switch(operation){
            case "add":
                result=num1+num2;
            break;

            case "sub":
                result=num1-num2;
            break;

            case "mul":
                result=num1*num2;
            break;

            case "div":
                result=num1/num2;
            break;
        }


        System.out.println(result);
    }
}
