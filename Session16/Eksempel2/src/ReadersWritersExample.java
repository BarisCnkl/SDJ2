public class ReadersWritersExample {
  public static void main(String[] args) {
    ReadWriteLock lock = new ReadWriteLock();

    Thread writer1 = new Thread(new Writer(lock), "Writer1");
    Thread writer2 = new Thread(new Writer(lock), "Writer2");
    Thread reader1 = new Thread(new Reader(lock), "Reader1");
    Thread reader2 = new Thread(new Reader(lock), "Reader2");
    Thread reader3 = new Thread(new Reader(lock), "Reader3");

    writer1.start();
    reader1.start();
    reader2.start();
    writer2.start();
    reader3.start();
  }
}
