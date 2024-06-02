public class SquareToRectangleAdapter implements Rectangle {
  private Square square;

  public SquareToRectangleAdapter(Square square) {
    this.square = square;
  }

  @Override
  public double getWidth() {
    return square.calculateArea();
  }

  @Override
  public double getHeight() {
    return square.calculateArea();
  }
}
