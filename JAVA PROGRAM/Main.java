public class Main {
    public int substract(int number1,int number2) {
        return number1-number2;
    }
    public long substract(long number1,long number2) {
        return number1-number2;
    }
    public static void main(String[] args) {
        Main subtraction=new Main();
        int first= subtraction.substract(4,5);
        System.out.println("substraction of two number is ="+ first);
        long second =subtraction.substract(3,8);
        System.out.println("substraction of two number is ="+ second);
    }
}