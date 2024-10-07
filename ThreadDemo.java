class FirstNameThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First Name");
        }
    }
}

class LastNameThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Last Name");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        FirstNameThread t1 = new FirstNameThread();
        LastNameThread t2 = new LastNameThread();

        t1.start();
        t2.start();
    }
}
