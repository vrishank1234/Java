class JavaThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java");
        }
    }
}

class PythonThread implements Runnable {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Python");
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new JavaThread());
        Thread t2 = new Thread(new PythonThread());

        t1.start();
        t2.start();
    }
}
