// class Q{
//     int n;
//     synchronized int get(){
//         System.out.println("Got: "+n);
//         System.out.println();
//         return n;
//     }
//     synchronized void put(int n){
//         this.n = n;
//         System.out.println("Put :"+n);
//     }
// }
// class Producer implements Runnable{
//     Q q;
//     Producer(Q q){
//         this.q = q;
//     }
//     public void run(){
//         int i = 0;
//         while (true) {
//             q.put(i++);
//             try{Thread.sleep(100);}
//             catch(InterruptedException e){}
//         }
//     }
// }
// class Consumer implements Runnable{
//     Q q;
//     Consumer(Q q){
//         this.q = q;
//     }
//     public void run(){
//         while (true){
//             q.get();
//             try {
//                 Thread.sleep(100);
//             } catch (InterruptedException e) {}
//         }
//     }
// }

// public class IncorrectInterThreadComm1{
//     public static void main(String[] args) {
//         Q q = new Q();
//         Producer p = new Producer(q);
//         Consumer c = new Consumer(q);
//         Thread t1 = new Thread(p,"Producer");
//         Thread t2 = new Thread(c,"Consumer");
//         t1.start();
//         t2.start();
//         System.out.println("Press ctrl-c to stop");
//     }
// }

//This code is the CORRECT implementation of Producer-consumer problem.

class Q {
    int n;
    boolean isValueSet=false;
    synchronized int consume() {
        while(!isValueSet){
            try{
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("Wait interrupted");
            }
        }
        System.out.println("Get: "+n);
        System.out.println();
        isValueSet=false;
        notify();
        return n;
    }
    synchronized void produce(int n) {
        while (isValueSet) {
            try{wait();}
            catch(InterruptedException e) {
                System.out.println("Wait interrupted");
            }
        }
        this.n=n;
        isValueSet=true;
        System.out.println("Put: "+n);
        notify();
    }
}

class Producer implements Runnable{
    Q q;
    Producer(Q q) {
        this.q=q;
    }
    public void run() {
        int i=0;
        while (true) {
            q.produce(i++);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Consumer(Q q) {
        this.q=q;
    }
    public void run() {
        while (true) {
            q.consume();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ProducerConsumerImplementation2 {
    public static void main(String[] args) {
        Q q=new Q();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);
        Thread t1=new Thread(p, "Producer");
        Thread t2=new Thread(c, "Consumer");
        t1.start();
        t2.start();
    }
}