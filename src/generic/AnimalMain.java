package generic;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("커리지", 10);
        Dog dog2 = new Dog("흰둥이", 10);
        Cat cat = new Cat("톰", 30);

        AnimalHospitalV3<Animal> hospital = new AnimalHospitalV3<>();
        hospital.set(dog1);
        hospital.checkup();

        Animal animal = hospital.bigger(cat);
        System.out.println("bigger.getName() = " + animal.getName());

    }
}
