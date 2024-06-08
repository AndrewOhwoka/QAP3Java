package ProblemTwo;

public class Circle extends Shape {
    // Data fields
    private double radius = 1.0;
    
    // Constructors
    public Circle() {
        super();
        this.radius = 1.0;
        }
    
    public Circle(double radius) {
        super();
        this.radius = radius;
        }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        }
    // Getters and Setters
    public double getRadius() {
        return radius;
        }
    
    public void setRadius(double radius) {
        this.radius = radius;
        }

    // Methods to calculate area and perimeter
    public double getArea() {
        return Math.PI * radius * radius;
        }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
        }
    // ToString method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " 
        + super.toString();
        }
    }
    

