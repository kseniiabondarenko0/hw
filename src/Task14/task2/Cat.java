package Task14.task2;

public class Cat extends Pet implements IAnimal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+" meows");
    }

    @Override
    public void eat() {
        System.out.println(name+" eats fish");
    }

    @Override
    public void play() {
        System.out.println(name+" plays with a small ball");
    }
}
