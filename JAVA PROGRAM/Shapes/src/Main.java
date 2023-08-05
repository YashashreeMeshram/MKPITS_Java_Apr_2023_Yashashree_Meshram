import shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Shape s;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1- circle, enter 2-rectangle:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("enter radius:");
                int r=sc.nextInt();
                s=new Circle(r);
                s.calArea();
                break;
            case 2:
                System.out.print("enter length and breadth:");
                s=new Rectangle(sc.nextInt(),sc.nextInt());
                s.calArea();
                break;
            default:
                System.out.print("Invalid choice");
        }
    }
}