

import java.util.Vector;

public class Vector_Practice {
    public static void main(String args[]){
        Vector<String> vector= new Vector<>();
        vector.add("Amravati");
        vector.add("Mumbai");
        vector.add("Agra");
        vector.add("Pune");
        vector.add("Chennai");
        vector.add("Indore");
        vector.add("Rajasthan");

        System.out.println("Initial Vector: " + vector);

        // Using remove()
        String element =vector.remove(1);
        String element1 =vector.remove(3);
        System.out.println("Removed Element: " + element);
        System.out.println("Removed Element: " + element1);
        System.out.println("New Vector: " + vector);

        // Using clear()
        vector.clear();
        System.out.println("Vector after clear(): " + vector);
        }
        }
