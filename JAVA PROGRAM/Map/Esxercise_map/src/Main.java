import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the tree map
        treeMap.put("Prajacta", 4);
        treeMap.put("Payal", 3);
        treeMap.put("Prince", 2);
        treeMap.put("Piyush", 9);
        treeMap.put("Pratik", 7);
        treeMap.put("Prachi", 11);
        treeMap.put("Priya", 5);
        treeMap.put("Pooja", 1);
        System.out.println(treeMap);

        // Getting values from the tree map
        int valueA = treeMap.get("Prince");
        System.out.println("Value of Prince: " + valueA);
        System.out.println(treeMap);

        // Removing elements from the tree map
        treeMap.remove("Pooja");
        System.out.println(treeMap);

        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }}