package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.log;

public class CasMainV2 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        int resultValue1 = incrementAndGet(atomicInteger);
        System.out.println("resultValue1 = " + resultValue1);

        int resultValue2 = incrementAndGet(atomicInteger);
        System.out.println("resultValue1 = " + resultValue2);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;

        do {
            getValue = atomicInteger.get(); // 현재 값을 읽어보고 아무도 변경하지 않았을 때
            log("getValue: " + getValue);

            // 여기서 CAS 연산을 쓰는 것. 가져온 것에다 + 1을 해, 성공하면 true, 실패하면 false
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            log("result: " + result);

        } while (!result);

        return getValue + 1;
    }

}
