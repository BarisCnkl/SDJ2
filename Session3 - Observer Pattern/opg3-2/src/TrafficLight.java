import java.util.ArrayList;

public class TrafficLight
{
  private ArrayList <Car> cars;
  private ArrayList<Taxi> taxis;
  private ArrayList<SleepyDriver> sleepyDrivers;
  private ArrayList<Pedestrian> pedestrians;
  private String[] lights = {"GREEN", "YELLOW", "RED", "YELLOW" };
  private int count = 2;
  private String currentLight;

  public TrafficLight()
  {
    currentLight = lights [2];
    cars = new ArrayList<>();
    taxis = new ArrayList<>();
    sleepyDrivers = new ArrayList<>();
    pedestrians = new ArrayList<>();
  }
  public void addCar(Car car)
  {
    cars.add(car);
    car.setLight(currentLight);
  }
  public void addTaxi(Taxi taxi)
  {
    taxis.add(taxi);
    taxi.setLight(currentLight);
  }
  public void addSleepyDrivers(SleepyDriver sleepyDriver)
  {
    sleepyDrivers.add(sleepyDriver);
    sleepyDriver.setLight(currentLight);
  }
  public void addPedestrians(Pedestrian pedestrian)
  {
    pedestrians.add(pedestrian);
    pedestrian.setLight(currentLight);
  }
  public void start() throws InterruptedException
  {
    for (int i = 0; i < 10; i++)
    {
      Thread.sleep(2000);
      count = (count + 1) % 4;
      currentLight = lights[count];
      System.out.println("Light is: " + currentLight);
      lightsChanged();
    }
  }
  private void lightsChanged()
  {
    for (int i = 0; i < cars.size(); i++)
    {
      cars.get(i).setLight(currentLight);
    }
    for (int i = 0; i < taxis.size(); i++)
    {
      taxis.get(i).setLight(currentLight);
    }
    for (int i = 0; i < sleepyDrivers.size(); i++)
    {
      sleepyDrivers.get(i).setLight(currentLight);
    }
    for (int i = 0; i < pedestrians.size(); i++)
    {
      pedestrians.get(i).setLight(currentLight);
    }
  }
}
