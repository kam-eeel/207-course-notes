/**
 * Represents a 2D rectangle with positive dimensions.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * A 2D rectangle with positive dimensions.
   *
   * @param width the width of this rectangle.
   * @param height the height of this rectangle.
   */
  public Rectangle(double width, double height) {
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Dimensions must be positive.");
    }
    this.width = width;
    this.height = height;
  }

  /**
   * Returns the width of this rectangle.
   *
   * @return the width of this rectangle.
   */
  public double getWidth() {
    return this.width;
  }

  /**
   * Returns the height of this rectangle.
   *
   * @return the height of this rectangle.
   */
  public double getHeight() {
    return this.height;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the area of this rectangle.
   */
  public double area() {
    return this.width * this.height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor by which the rectangle should be scaled.
   */
  public void scale(double factor) {
    if (factor <= 0) {
      throw new IllegalArgumentException("Scale factor must be positive.");
    }
    this.width *= factor;
    this.height *= factor;
  }

  /**
   * Returns true if this rectangle is larger than other, and false otherwise.
   *
   * @param other another rectangle.
   * @return true if this rectangle is larger than other, and false otherwise.
   */
  public boolean isLargerThan(Rectangle other) {
    if (other == null) {
      throw new IllegalArgumentException("Comparison rectangle cannot be null.");
    }
    return this.area() > other.area();
  }
}
