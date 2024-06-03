public interface Lane
{
  void enterFromTheLeft(); // Allowed only when no cars from the right side are on the lane
  void exitToTheRight(); // A car has exited the lane to the right side
  void enterFromTheRight(); // Allowed only when no cars from the left side are on the lane
  void exitToTheLeft(); // A car has exited the lane to the left side
}