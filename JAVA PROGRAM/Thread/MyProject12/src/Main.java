public class Main  {
    public static void main(String args[]){
        Thread t1=new Thread(new YourThread());
        Thread t2=new Thread(new MyThread());

        t1.setName("Yashashree");
t2.setName("shree");
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
       t1.setPriority(10);
       t2.setPriority(2);

}}