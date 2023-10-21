import java.util.*;
public class Collection_TreeMap2{
    public static void main(String args[]){

        // Create a tree map
        TreeMap<String,String> tree_map_first=new TreeMap<String,String>();

        // Put elements to the map
        tree_map_first.put("element_first", "Yashashree Meshram");
        tree_map_first.put("element_second", "Priya Matre");
        tree_map_first.put("element_third", "Aayushi Tale");
        tree_map_first.put("element_four", "Maithili Chaudhari");

        if(tree_map_first.containsValue("Yashashree Meshram")){
            System.out.println("The TreeMap contains word  Yashashree Meshram");
        } else {
            System.out.println("The TreeMap does not contain word Yashashree Meshram");
        }
        if(tree_map_first.containsValue("Parchi Adau")){
            System.out.println("The TreeMap contains word Prachi Adau");
        } else {
            System.out.println("The TreeMap does not contain word Prachi Adau");
        }
    }
}