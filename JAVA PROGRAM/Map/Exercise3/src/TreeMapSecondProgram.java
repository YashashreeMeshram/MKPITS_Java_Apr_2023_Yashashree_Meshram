import java.util.TreeMap;

public class TreeMapSecondProgram {
    public static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();

        tree.put(105, "Shreyu");
        tree.put(106, "Pari");
        tree.put(103, "Shree");
        tree.put(102, "Yashu");
        tree.put(107, "Shaily");
        tree.put(109, "Siya");
        tree.put(104, "Gudiya");
        System.out.println("TreeMap: " + tree);

        // Using entrySet()
        System.out.println("Key/Value mappings: " + tree.entrySet());

        // Using keySet()
        System.out.println("Keys: " + tree.keySet());

        // Using values()
        System.out.println("Values: " + tree.values());
    }
}