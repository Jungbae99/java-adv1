package generic;

public class GenericMethodMain {
    public static void main(String[] args) {

        Integer i = 10;
        Integer a = GenericMethod.<Integer>numberMethod(i);
    }
}
