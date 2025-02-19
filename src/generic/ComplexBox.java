package generic;

/**
 *인스턴스 메서드 제네릭 타입과 제네릭 메서드의 타입 매개변수를 같은 이름으로 사용할때
 * */
public class ComplexBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <V extends Animal> V printAndReturn(V v) {
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + v.getClass().getName());
        // t.getName(); // 호출 불가 메서드는 <T> 타입이다. <T extends Animal> 타입이 아니다.
        return v;
    }

}