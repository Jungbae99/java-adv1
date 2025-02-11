package thread.collection.java;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> copyList = new CopyOnWriteArrayList<>();
        Set<Integer> copySet = new CopyOnWriteArraySet<>();


        Set<Object> skipSet = new ConcurrentSkipListSet<>(); // 정렬해줌
        Map<Object, Object> skipMap = new ConcurrentSkipListMap<>(); // 정렬해줌

        Map<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();

    }
}
