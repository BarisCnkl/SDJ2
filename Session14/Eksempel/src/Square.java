public class Square {
  private double side;

  public Square(double side) {
    this.side = side;
  }

  public double calculateArea() {
    return side * side;
  }

  public double getSide()
  {
    return side;
  }
}