package generic;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println(animal.getName());
        System.out.println(animal.getSize());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
