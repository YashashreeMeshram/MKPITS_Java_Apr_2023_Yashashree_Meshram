public class ThreadB extends Thread{
    float total;

    @Override
    public void run() {
        synchronized (this){
            for(float i=0;i<20.3;i++){
                total +=i;
            }
 notify();
        }
    }}