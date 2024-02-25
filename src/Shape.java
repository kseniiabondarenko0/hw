public class Shape {
    private  int x;
    private int y;
    private String color;

    final double pi = 3.14;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw() {

    }

    public void resize(int width, int height) {

    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printCoordinates() {
        System.out.println("Coordinates: x = " + x + ", y = " + y);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void area(){
    }
}
