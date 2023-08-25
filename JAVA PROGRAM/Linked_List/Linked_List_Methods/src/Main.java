import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String args[])
    {

        LinkedList list = new LinkedList<String>();

        // use add() method to add elements in the list
        System.out.println("Original list");
        list.add("Yashashree");
        list.add("Vishakha");
        list.add("Mayuri");
        list.add("Pallavi");
        list.add("20");
        System.out.println(list);
       // Added first elemet in the Linked List
        System.out.println("added first element");
        list.addFirst("Pari");
        list.addFirst("At");
        //Added last element in Linked list
        System.out.println(list);
        System.out.println("added last element");
        list.addLast("Bhawana");
        System.out.println(list);
        LinkedList list1=new LinkedList();
        list1.addAll(list);

        System.out.println(list.poll());
        System.out.println(list1);
        System.out.println(list1.peek());
        System.out.println(list1);
        //Display elements and their positions in a linked list
        System.out.println("The new List is:" + list);
            System.out.println("Original linked list:" + list);
            for(int counter=0; counter < list.size(); counter++)
            {
                System.out.println("Element at index "+counter+": "+list.get(counter));
            }
        }
    }
