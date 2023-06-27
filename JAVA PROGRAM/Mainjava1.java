import java.util.Scanner;

public class Mainjava1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper half number : ");
        int number1 = scanner.nextInt();

        StarPatternRightAngleUpperHalf starRightAngleUpperHalf = new StarPatternRightAngleUpperHalf();
        starRightAngleUpperHalf.starPatternRightAngleUpperHalf(number1);



    }
}