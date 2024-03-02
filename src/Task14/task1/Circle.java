package Task14.task1;

public class Circle implements IArea{

    private double radius;

    final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void area() {
        double area = Math.pow(radius, 2);
        area *= pi;
        System.out.println("Area of your circle is:\t"+area);
    }
}
