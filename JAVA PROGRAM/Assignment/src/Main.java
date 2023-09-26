import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {

        //1 filtering
        List<String> cities = Arrays.asList("Morshi", "Chandurbazar", "Amaravati");
        cities.stream().filter(c -> c.startsWith("A")).forEach(System.out::println);

        //2 collecting
        List list1 = cities.stream().filter(c -> c.startsWith("A")).collect(Collectors.toList());
        System.out.println(list1);

        //3 Mapping
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        num.stream().map(n -> n * 2).forEach(System.out::println);
        List doubleArrayListNumber = num.stream().map(n -> n).collect(Collectors.toList());
        System.out.println("doubleArrayListNumbers");


        // 4 Sort strings in ascending order
        List<String> city = Arrays.asList("Amaravati", "Morshi", "Aarvi", "Wardha");
        System.out.println("Original List of strings(cities): " + cities);
        cities.stream().sorted().forEach(System.out::println);
        List<String> ascendingOrder = cities.stream().collect(Collectors.toList());
        System.out.println("ascendingOrder");


        // 5 filter interface
        List<Integer> input = Arrays.asList(5, 3, 15, 9, 2, 5, 11);
        Stream<Integer> stream = input.stream().filter(number -> number >= 9);
        stream.forEach(number -> System.out.println("greater number" + number));


        // 6 Combining Opertion
        List<Integer> input1 = Arrays.asList(5, 3, 15, 9, 2, 5, 11);
        input = (List<Integer>) list1.stream().filter(n -> 1 % 2 == 0).collect(Collectors.toList());
        System.out.println(input);
        int sumOfDoubleNumber = input.stream().reduce(0, (sum, n) -> sum + n);
        System.out.println(sumOfDoubleNumber);


        // 7 Grouping and Counting
        List<String> strings = Arrays.asList("apple", "mango", "banana", "grapes");
        Map<Integer, List<String>> map = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        strings.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));


    }
}





