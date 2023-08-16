public class MyThread2 implements Runnable {
    @Override
    public void run() {
        int number = 30;
        System.out.println("List of even numbers from 1 to " + number + ": ");
        for(int i = 1; i <= 30; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i +"\t");
            }
        }
    }

    }

