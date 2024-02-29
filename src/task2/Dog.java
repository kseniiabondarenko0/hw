package task2;

public class Dog extends Pet implements IAnimal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name+" barks");
    }

    @Override
    public void eat() {
        System.out.println(name+" eats bones");
    }

    @Override
    public void play() {
        System.out.println(name+" plays fetch");
    }
}
