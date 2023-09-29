import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        arrayList.addAll(Arrays.asList(34,65,87,67,45,24,43,28,85,64,39));
        arrayList.forEach(number-> {
            if(number %2==0)
                System.out.println("Even numbers"+number);
        });
        arrayList.forEach(number-> {
            if(number %2!=0)
                System.out.println("odd numbers"+number);
        });
    }
}