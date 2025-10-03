public class calculator2{
    public static void main(String[] args){
        float num1 = 40;
        float num2 = 80;
        String operation = "div";
        float result = 0;

        if(operation == "add") {
            result=num1+num2;
        } else if(operation == "sub"){
            result=num1-num2;
        } else if(operation == "mul"){
            result=num1*num2;
        } else if(operation == "div"){
            result=num1/num2;
        }

        System.out.println(result);
    }
}
