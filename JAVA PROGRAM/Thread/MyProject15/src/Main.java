public class Main {
    public static void main(String[] args) {
        Sender obj=new Sender();
        ThreadedSend t1=new ThreadedSend("Hello",obj);
        ThreadedSend t2=new ThreadedSend("Thank You",obj);
        t1.start();
        t2.start();
    }
}