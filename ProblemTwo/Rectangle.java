package ProblemTwo;

public class Rectangle extends Shape {
    //Data fields
    private double width = 1.0;
    private double length = 1.0;

    //Constructors
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //Getters and Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Methods to calculate area and perimeter
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    //ToString method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}

 