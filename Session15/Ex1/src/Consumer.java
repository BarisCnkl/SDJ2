class Consumer extends Thread {
  private Buffer buffer;

  public Consumer(Buffer buffer) {
    this.buffer = buffer;
  }

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Consumed: " + buffer.get());
    }
  }
}
