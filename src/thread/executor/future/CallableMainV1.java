package thread.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CallableMainV1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Future<Integer> future = es.submit(new MyCollable());
        Integer result = future.get();
        log("result value: " + result);
        es.close();
    }

    static class MyCollable implements Callable<Integer> {
        @Override
        public Integer call() {
            log("Collable 시작");
            sleep(2000);
            int value = new Random().nextInt(10);
            log("create value : " + value);
            log("Collable 완료");
            return value;
        }
    }
}
