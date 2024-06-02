public class RectangleClient {
  public static void main(String[] args) {
    Square square = new Square(5);
    Rectangle rectangle = new SquareToRectangleAdapter(square);

    System.out.println("Rectangle Width: " + rectangle.getWidth());
    System.out.println("Rectangle Height: " + rectangle.getHeight());
  }
}
