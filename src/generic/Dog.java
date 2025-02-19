package generic;

public class Dog implements Animal {

    private String name;
    private int size;

    public Dog(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void sound() {
        System.out.println("개가 짖어요");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }
}
