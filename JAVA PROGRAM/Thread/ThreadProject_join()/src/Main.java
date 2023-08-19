public class Main {
    public static void main(String[] args) {

       Thread t=new Thread(new MyThread());

        Thread t2=new Thread(new YourThread());
        t.start();
        t2.start();
    }
}