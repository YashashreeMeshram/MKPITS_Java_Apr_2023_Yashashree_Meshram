import java.util.Scanner;

public class StarPatternRightAngleUpperHalf1{
    public void starPatternRightAngleUpperHalf(int number){
       
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}