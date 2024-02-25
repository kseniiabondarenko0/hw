public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius = " + radius + ", color = " + getColor());
    }

    @Override
    public void resize(int width, int height) {
        radius = Math.max(width, height) / 2;
        System.out.println("Resizing circle to radius = " + radius);
    }

    public void area(){
        double area = 2*pi*radius;
        System.out.println("Area: "+ area);
    }
}
