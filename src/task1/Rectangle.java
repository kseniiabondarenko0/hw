package task1;

public class Rectangle implements IArea{
    private double height;

    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public void area() {
        double area = height*width;
        System.out.println("Area of rectangle :\t"+ area);
    }
}
