import java.util.Scanner;

public class DownAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter lower half number : ");
        int number2 = scanner.nextInt();

        DownRightAngleLowerHalf starDownRightAngleLowerHalf = new DownRightAngleLowerHalf();
        starDownRightAngleLowerHalf.starPatternDownRightAngleLowerHalf(number2);
    }
}