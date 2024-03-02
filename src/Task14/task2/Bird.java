package Task14.task2;

public class Bird extends Pet implements IAnimal{

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+" chirps");
    }

    @Override
    public void eat() {
        System.out.println(name+" eats seeds");
    }

    @Override
    public void play() {
        System.out.println(name+" sings melodies");
    }
}
