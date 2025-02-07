package thread.cas.increment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInteger implements IncrementInteger {

    private final Lock lock = new ReentrantLock();
    private int value;

    @Override
    public void increment() {
        try {
            lock.lockInterruptibly();
            value++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int get() {
        try {
            lock.lockInterruptibly();
            return value;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
