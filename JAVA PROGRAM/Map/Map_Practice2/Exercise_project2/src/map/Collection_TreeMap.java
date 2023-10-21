

package map;

import java.util.*;
public class Collection_TreeMap {
    public static void main(String args[]){

        // Create a tree map
        TreeMap<String,String> tree_map_first =new TreeMap<String,String>();

        // Put elements to the map
        tree_map_first.put("element", "Riya Sharma");
        tree_map_first.put("element", "Anisha Deshpande");
        tree_map_first.put("element", "Shiba Khan");
        tree_map_first.put("element", "Jasmin Bhovate");
        tree_map_first.put("element", "Samiksha Kadam");
        System.out.println("Tree Map 1: "+tree_map_first);
        TreeMap<String,String> tree_map_second = new TreeMap<String,String>();
        tree_map_second.put("2_element", "Orange");
        tree_map_second.put("2_element", "Pink");
        System.out.println("Tree Map 2: "+tree_map_second);
        tree_map_first.putAll(tree_map_second);
        System.out.println("Element copied map_second to map_first: "+tree_map_first);
    }
}
