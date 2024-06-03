public class Reader implements Runnable {
  private ReadWriteLock lock;

  public Reader(ReadWriteLock lock) {
    this.lock = lock;
  }

  @Override
  public void run() {
    try {
      lock.readLock();
      System.out.println(Thread.currentThread().getName() + " started reading");
      Thread.sleep(1000); // Simuler læsetid
      System.out.println(Thread.currentThread().getName() + " finished reading");
      lock.readUnlock();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
