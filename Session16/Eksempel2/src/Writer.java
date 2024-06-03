public class Writer implements Runnable {
  private ReadWriteLock lock;

  public Writer(ReadWriteLock lock) {
    this.lock = lock;
  }

  @Override
  public void run() {
    try {
      lock.writeLock();
      System.out.println(Thread.currentThread().getName() + " started writing");
      Thread.sleep(1000); // Simuler skrivningstid
      System.out.println(Thread.currentThread().getName() + " finished writing");
      lock.writeUnlock();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
