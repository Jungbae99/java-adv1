package thread.start.test;

import static util.MyLogger.log;

public class StartTest1Main {
    public static void main(String[] args) {
        CounrThread thread = new CounrThread();
        thread.start();
    }

    static class CounrThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

