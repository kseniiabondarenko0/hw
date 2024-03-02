package Task14.task2;

public class Main1 {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 9);
        barsik.eat();
        barsik.play();
        barsik.makeSound();

        System.out.println();

        Dog gerald = new Dog("Gerald", 3);
        gerald.eat();
        gerald.play();
        gerald.makeSound();

        System.out.println();

        Bird baby = new Bird("Baby", 1);
        baby.eat();
        baby.play();
        baby.makeSound();




    }
}
