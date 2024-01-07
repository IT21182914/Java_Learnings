package OOP.Abstraction.Shapes;

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}
