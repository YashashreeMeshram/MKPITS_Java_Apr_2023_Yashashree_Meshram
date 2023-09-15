import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


      public class Main {
       public static void main(String[] args) {
           List<String> cities = Arrays.asList("Amaravati", "Chandurbazar", "Morshi","Nagpur","Haidrabad","Pune");


        //Consumer interface
        Consumer<List<String>> uppercaseConsumer = List -> {
            for (int sum = 0; sum < List.size(); sum++) {
                List.set(sum, List.get(sum).toUpperCase());
            }
        };
        Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);
        uppercaseConsumer.andThen(printConsumer).accept(cities);



        //function interface
        Function<String, Integer> nameMappingFunction = String::length;
        cities.stream().map(nameMappingFunction).forEach(c -> System.out.println(c));



        //predicate interface
        Predicate<String> namesContainA = str -> str.contains("A");
        cities.stream().filter(namesContainA).forEach(c -> System.out.println(c));



        // supplier interface
        Supplier<Double> supplier = () -> {
            return Math.random();
        };
        System.out.println(supplier.get()); //...in Supplier Interface get() method is used
    }
}

