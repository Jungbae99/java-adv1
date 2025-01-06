package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new ThreadA(), "Thread-A");
        threadA.start();
        Thread threadB = new Thread(new ThreadB(), "Thread-B");
        threadB.start();
    }

    static class ThreadA implements Runnable {
        @Override
        public void run() {
            while (true) {
                log("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

    static class ThreadB implements Runnable {
        @Override
        public void run() {
            while (true) {
                log("B");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}


