class RunnableThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}

class ExtendedThread extends Thread {
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableThread(), "RunnableThread");
        ExtendedThread t2 = new ExtendedThread();
        t2.setName("ExtendedThread");

        t1.start();
        t2.start();
    }
}
