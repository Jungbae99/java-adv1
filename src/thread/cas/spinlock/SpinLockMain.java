package thread.cas.spinlock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockMain {
    public static void main(String[] args) {
        SpinLock spinLockBad = new SpinLock();

        Runnable runnable = () -> {
            spinLockBad.lock();
            try {
                // critical section
                log("비즈니스 로직 실행");
                sleep(1); // 오래 걸리는 로직에서 스핀 락 사용 X
            } finally {
                spinLockBad.unlock();
            }
        };

        Thread t1 = new Thread(runnable, "thread-1");
        Thread t2 = new Thread(runnable, "thread-2");

        t1.start();
        t2.start();
    }
}
