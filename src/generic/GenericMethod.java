package generic;

public class GenericMethod {
    public static Object objMethod(Object object) {
        System.out.println("Object is " + object);
        return object;
    }

    public static <T> T genericMethod(T t) {
        System.out.println("generic print = " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound print = " + t);
        return t;
    }
}
