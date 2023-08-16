public class MyThread1 implements Runnable {
    @Override
    public void run() {
        int number = 30;
        System.out.println("List of odd numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {

            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}