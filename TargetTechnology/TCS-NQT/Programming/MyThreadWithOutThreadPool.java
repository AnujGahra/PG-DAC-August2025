class MyThread extends Thread {
    public void run() {
        System.out.println("Task executed by " + Thread.currentThread().getName());
    }
}

public class MyThreadWithOutThreadPool {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            MyThread t = new MyThread();
            t.start();
        }

    }
}