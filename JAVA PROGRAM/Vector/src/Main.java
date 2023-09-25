import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class Main {
    public static void main(String[] args) {
        int value;
        Vector<Integer> vector = new Vector<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        Scanner scanner = new Scanner(System.in);
        for (int counter = 0; counter < 10; counter++) {
            System.out.println("Enter a Number = ");
            value = scanner.nextInt();
            vector.set(value % 10, value);

        }
        System.out.println(vector.size());
        System.out.println(vector);
        Vector newVector = new Vector<>();
        for (int number = 0; number < vector.size(); number++) {
            if (vector.elementAt(number) != 0)
                newVector.add(vector.elementAt(number));
        }
        System.out.println(newVector);
    }
}