public class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    ThreadedSend(String m, Sender obj) {
        msg = m;
        sender = obj;
    }

    public void run() {
        synchronized (sender) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            sender.send(msg);

        }

    }
}