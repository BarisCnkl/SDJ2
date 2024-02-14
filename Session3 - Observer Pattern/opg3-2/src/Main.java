public class Main
{
  public static void main(String[] args) throws InterruptedException
  {
    TrafficLight trafficLight = new TrafficLight();

    //Cars:
    Car car1 = new Car(1);
    trafficLight.addPropertyChangeListener(car1);
    //Taxis:
    Taxi taxi1 = new Taxi(1);
    trafficLight.addPropertyChangeListener(taxi1);
    //SleepyDrivers:
    SleepyDriver sleepyDriver1 = new SleepyDriver(1);
    trafficLight.addPropertyChangeListener(sleepyDriver1);
    //Pedestrians:
    Pedestrian pedestrian1 = new Pedestrian(1);
    trafficLight.addPropertyChangeListener(pedestrian1);

    //Start your trafficlight:
    trafficLight.start();
  }
}
