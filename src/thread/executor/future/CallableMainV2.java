
package thread.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CallableMainV2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        log("submit() 호출");
        Future<Integer> future = es.submit(new MyCollable());
        log("future 즉시 반환, future = " + future);

        log("future.get() [블로킹] 메서드 호출 시작 -> main 스레드 WAITING");
        Integer result = future.get();
        log("future.get() [블로킹] 메서드 호출 완료 -> main 스레드 RUNNING");

        log("result value: " + result);
        log("future 완료, future = " + future);
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
