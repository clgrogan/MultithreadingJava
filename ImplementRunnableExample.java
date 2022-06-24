public class ImplementRunnableExample implements Runnable {

  private int threadNumber;

  public ImplementRunnableExample(int threadNumber) {
    this.threadNumber = threadNumber;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread name is " + threadNumber + " Loop iteration: " + (i + 1));
      if (threadNumber == 3) {
        System.out.println(threadNumber);
        throw new RuntimeException("Boom!");
      }
      try {
        Thread.sleep(600);
      } catch (InterruptedException e) {
        System.out.println("Oops..." + e.getMessage());
        e.printStackTrace();
      }
    }
  }

}
