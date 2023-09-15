import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        List<String>cities= Arrays.asList("Nagpur","Amravati","Pune","Mumbai","Haidrabad");
        List list=cities.stream().map(c->c).collect(Collectors.toList());
        System.out.println("List of Cities = "+list);

        List<Integer>numbers=Arrays.asList(65,67,87,78,90,97,23,34,56,52);
        List list1=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("List of Numbers =" +list1);

        cities.stream().sorted().forEach(System.out::println);

        int sumOfNumbers=numbers.stream().reduce(0,(sum,n)->sum+n);
        System.out.println("Addition of Numbers = "+sumOfNumbers);

        int sumOfEvenNumbers=numbers.stream().filter(n->n%2==0).reduce(0,(sum,n)->sum+n);
        System.out.println("Addition of even numbers which number is divisible by 2 = "+sumOfEvenNumbers);
    }
}