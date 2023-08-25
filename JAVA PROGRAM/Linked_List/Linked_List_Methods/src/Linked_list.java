import java.util.LinkedList;
import java.util.Scanner;

public class Linked_list {
    public static void main(String [] args) {
        LinkedList list=new LinkedList();
        Scanner scanner=new Scanner(System.in);
        String name,choice;
        do {
            System.out.println("Enter Name");
            name=scanner.next();
            list.add(name);
            System.out.println("Do you want to add another name? yes/no");
            choice=scanner.next();
        }while(choice.equalsIgnoreCase("yes"));
        for(Object l:list) {
            System.out.println(l);
        }



    }
}
