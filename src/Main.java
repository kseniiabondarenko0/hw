import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //task1
        Product product1 = new Product("Лижі", 2000, 1);
        Product product2 = new Product("Шолом", 500, 1);

        Order order = new Order("Іван Петров", 235, 10);
        order.addProduct(product1);
        order.addProduct(product2);
        order.removeProduct(product1);

        System.out.println("Загальна вартість замовлення: " + order.getTotalPrice());


        //task2
        Shape rectangle = new Rectangle(10, 20, "blue", 30, 40);
        rectangle.draw();
        rectangle.resize(50, 60);
        rectangle.move(100, 150);
        rectangle.printCoordinates();
        rectangle.resize(4, 5);
        rectangle.area();

        Shape circle = new Circle(50, 50, "red", 25);
        circle.draw();
        circle.resize(40, 40);
        circle.move(200, 200);
        circle.printCoordinates();
        circle.area();
    }



}
