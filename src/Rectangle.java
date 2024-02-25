
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with width = " + width + ", height = " + height + ", color = " + getColor());
    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println("Resizing rectangle to width = " + width + ", height = " + height);
    }
    public void area(){
        int area = width*height;
        System.out.println("Area: "+area);
    }
}