package generic;

public class Cat implements Animal {

    private String name;
    private int size;

    public Cat(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void sound() {
        System.out.println("고양이 짖음");
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
