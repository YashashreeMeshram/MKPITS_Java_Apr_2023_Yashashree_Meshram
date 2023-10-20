

import java.util.*;
public class Main {
    public static void main(String args[]){
        // Create a tree map
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        // Put elements to the map
        tree_map.put(1, "Shreya Meshram");
        tree_map.put(2, "Mayuri Agham");
        tree_map.put(3, "Vishakha Ambadare");
        tree_map.put(4, "Bhawana Rangari");
        tree_map.put(5, "Maithili Chaudhari");

        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}