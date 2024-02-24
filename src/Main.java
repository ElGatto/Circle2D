// Create a Main class
public class Main
{
    // Main method
    public static void main(String[] args)
    {
        // Create an object c1 of Circle2D class with x = 2, y = 2 and radius = 5.5
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // Compute the area and print
        System.out.println("Area: " + c1.getArea());

        // Compute the perimeter and print
        System.out.println("Perimeter: " + c1.getPerimeter());

        // Check c1 contains point (3,3)
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));

        // Check c1 contains circle with x = 4, y = 5 and radius = 10.5
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));

        // Check c1 overlaps with circle x = 3, y = 5 and radius = 2.3
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}