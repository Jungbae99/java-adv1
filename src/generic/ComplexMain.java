package generic;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexBox<Animal> box = new ComplexBox();
        Cat cat = new Cat("톰", 30);

        Cat tom = box.printAndReturn(cat);
        System.out.println("tom = " + tom);
    }
}
