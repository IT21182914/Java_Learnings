package OOP.Abstraction.Shapes;

// Class implementing both abstract class and interface
// Class implementing both abstract class and interface
class ResizableCircle extends Circle implements Resizable {
    // Constructor
    public ResizableCircle(String color, double radius) {
        super(color, radius);
    }

    // Implementation of Resizable interface
    @Override
    public void resize(double factor) {
        // Accessing radius through the getter and setter
        setRadius(getRadius() * factor);
    }
}

