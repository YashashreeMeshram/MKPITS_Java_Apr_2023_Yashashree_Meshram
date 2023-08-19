public class Main {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        synchronized (b) {
            try {
                System.out.println("waiting for b to complete...");
                b.wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("total is :" + b.total);
            }
        }
    }
