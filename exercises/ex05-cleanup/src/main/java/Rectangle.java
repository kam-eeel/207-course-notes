/**
 * Represents a 2D rectangle with positive dimensions.
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double area() {
        return this.width * this.height;
    }

    /**
     * scales the rectangle
     * @param factor
     */
    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive.");
        }
        this.width *= factor;
        this.height *= factor;
    }

    public boolean isLargerThan(Rectangle other) {
        if (other == null) {
            throw new IllegalArgumentException("Comparison rectangle cannot be null.");
        }
        return this.area() > other.area();
    }
}
