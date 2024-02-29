package task1;

public class Triangle implements IArea{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    @Override
    public void area() {                        // це за формулою герона, щоб площу для будь-якого тр. рахувати
        double p = (a+b+c)/2;
        double area = p*(p - a)*(p-b)*(p-c);
        area = Math.sqrt(area);
        System.out.println("Area of triangle is:\t"+area);

    }
}
