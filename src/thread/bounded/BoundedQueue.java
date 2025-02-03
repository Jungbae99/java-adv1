package thread.bounded;

// 버퍼 역할을 하는 큐의 인터페이스
public interface BoundedQueue {
    void put(String data); // 생산자 스레드

    String take(); // 소비자 스레드
}
