package OOP.Abstraction.Shapes;

abstract class Shape {
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    abstract double calculateArea();

    // Concrete method to display color
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

