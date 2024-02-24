// Create a class Circle2D
public class Circle2D
{
    // Used to store the coordinates x & y of center
    private double x, y;

    // Used to store the radius of circle
    private double radius;

    // No-argument constructor to set x & y to 0 and radius to 1
    public Circle2D()
    {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    // Argument constructor to set x, y and radius
    public Circle2D(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Method to get x
    public double getX()
    {
        return x;
    }

    // Method to get y
    public double getY()
    {
        return y;
    }

    // Method to get radius
    public double getRadius()
    {
        return radius;
    }

    // Method to get area
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    // Method to get perimeter
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    // Method returns true if the specified point (x, y) is inside this circle
    public boolean contains(double x, double y)
    {
        // Compute the distance to x & y from center of circle
        double distance = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));

        // If distance is less than or equal to radius
        if(distance <= radius)

            return true;

            // If distance is greater than radius
        else

            return false;
    }

    // Method returns true if the specified circle is inside this circle
    public boolean contains(Circle2D circle)
    {
        // Compute the distance to x & y of circle from center of circle
        double distance = Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y));

        // If distance+radius is less than or equal to radius
        if(distance + circle.radius <= this.radius)

            return true;

            // If distance+radius is greater than radius
        else

            return false;
    }

    // Method returns true if the specified circle overlaps with this circle
    public boolean overlaps(Circle2D circle)
    {
        // Compute the distance to x & y of circle from center of circle
        double distance = Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y));

        // If distance is less than or equal the sum of radius of both the circle
        if(distance <= this.radius + circle.radius)

            return true;

            // If distance is greater than the sum of radius of both the circle
        else
            return false;
    }
}
