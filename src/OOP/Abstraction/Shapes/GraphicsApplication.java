package OOP.Abstraction.Shapes;

// Main application class
public class GraphicsApplication {
    public static void main(String[] args) {
        // Creating a resizable circle
        ResizableCircle resizableCircle = new ResizableCircle("Green", 8.0);
        resizableCircle.displayColor();
        System.out.println("Area: " + resizableCircle.calculateArea());

        // Resizing the circle
        resizableCircle.resize(1.5);
        System.out.println("Resized Area: " + resizableCircle.calculateArea());
    }
}