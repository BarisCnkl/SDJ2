class Buffer {
  private int item;
  private boolean available = false;

  public synchronized void put(int item) {
    while (available) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    this.item = item;
    available = true;
    notifyAll();
  }

  public synchronized int get() {
    while (!available) {
      try {
        wait();
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        return -1; // Indicate error or interruption.
      }
    }
    int item = this.item;
    available = false;
    notifyAll();
    return item;
  }
}
