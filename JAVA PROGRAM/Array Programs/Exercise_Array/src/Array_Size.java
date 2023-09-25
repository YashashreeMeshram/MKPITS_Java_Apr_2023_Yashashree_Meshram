import java.util.Arrays;
import java.util.Scanner;

public class Array_Size {
    public static void main(String[] args) {
        int arrayNumber;

        int value;
        int num[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Elements:");
        int m = input.nextInt();
        int[] array = new int[m];
        for (int number = 0; number < 10; number++) {
            System.out.printf("Element of of Array :" + number);
            value = input.nextInt();
            array[value % 10] = value;
        }
        System.out.println("\nDisplay an Array Elements...\n");
        for (int output : array) {
            System.out.println(output);
        }
        int count=0;
        for(int counter=0;counter<10;counter++){
            if( array[counter]!=0)
                count++;
        }
        double loadfactor=(double) count/10.0;     //calculate load factor
        System.out.println("Load Factor="+loadfactor);

        int newNumbers[]=new int[count];
        for (int counter=0,newCounter=0;counter<10;counter++){
            if(array[counter]!=0){
                newNumbers[newCounter]=array[counter];
                newCounter++;
            }
        }
        Arrays.sort(newNumbers);
        for(int output1:newNumbers){
            System.out.println(output1);
        }
    }
}



