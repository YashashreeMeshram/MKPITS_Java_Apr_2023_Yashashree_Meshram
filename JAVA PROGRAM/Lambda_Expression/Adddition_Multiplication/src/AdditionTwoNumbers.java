interface Addition{
    int add(int a,int b);
}

public class AdditionTwoNumbers{
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addition ad1=(a,b)->(a+b);
        System.out.println("Addition of two number with multiple parameters...="+ad1.add(28,32));

        // Multiple parameters with data type in lambda expression
        Addition ad2=(int a,int b)->(a+b);
        System.out.println("Addition of two number with multiple parameters with data type...="+ad2.add(50,20));
    }
}