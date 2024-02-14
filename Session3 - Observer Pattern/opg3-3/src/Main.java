public class Main
{
  public static void main(String[] args)
  {
    Bird bird1 = new Bird();

    BirdWatcher birdWatcher1 = new BirdWatcher(bird1);
    BlindBirdWatcher blindBirdWatcher1 = new BlindBirdWatcher(bird1);

    bird1.start();

  }
}
