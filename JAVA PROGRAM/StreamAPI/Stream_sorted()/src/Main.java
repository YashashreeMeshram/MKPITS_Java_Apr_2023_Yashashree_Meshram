import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        System.out.println("Original List : " + colors);
        // Sort strings in ascending order
        List<String> ascendingOrder = colors.stream()
                .sorted()
                .collect(Collectors.toList());


        System.out.println("\nSorted in Ascending Order: " + ascendingOrder);
    }
}