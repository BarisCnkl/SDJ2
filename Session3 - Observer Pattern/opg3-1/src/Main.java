public class Main
{
  public static void main(String[] args) throws InterruptedException
  {
    TrafficLight trafficLight = new TrafficLight();

    //Cars:
    Car car1 = new Car(1);
    Car car2 = new Car(2);
    Car car3 = new Car(3);
    Car car4 = new Car(4);

    //Taxis:
    Taxi taxi1 = new Taxi(1);
    Taxi taxi2 = new Taxi(2);

    //SleepyDrivers:
    SleepyDriver sleepyDriver1 = new SleepyDriver(1);

    //Pedestrians:
    Pedestrian pedestrian1 = new Pedestrian(1);
    Pedestrian pedestrian2 = new Pedestrian(2);
    Pedestrian pedestrian3 = new Pedestrian(3);
    Pedestrian pedestrian4 = new Pedestrian(4);

    //Adding cars:
    trafficLight.addCar(car1);
    trafficLight.addCar(car2);
    trafficLight.addCar(car3);
    trafficLight.addCar(car4);

    //Adding taxis:
    trafficLight.addTaxi(taxi1);
    trafficLight.addTaxi(taxi2);

    //Adding sleepyDriver:
    trafficLight.addSleepyDrivers(sleepyDriver1);

    trafficLight.start();
  }
}
