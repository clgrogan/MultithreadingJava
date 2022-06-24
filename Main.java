public class Main {
  public static void main(String[] args) {
    System.out.println(
        "One way to perform multithreading in Java is to extend the Thread class.\n\t- Advantage the executing code is a little cleaner.\n\t- Disadvantage is that the class can only extend one class, so if another class needed to be extended this would be an issue.");
    System.out.println(
        "\nAnother way to perform multithreading in Java is to implement the Runnable Interface.\n\t- Advantage this leaves the option to extend a different class as needed.\n\t- Disadvantage is that the calling code has to instantiate an object then pass in the threading class.");
    for (int i = 0; i < 5; i++) {

      ExtendThreadExample instance01 = new ExtendThreadExample(i);
      instance01.start();
    }
    for (int i = 100; i < 105; i++) {

      ExtendThreadExample instance01 = new ExtendThreadExample(i);
      Thread myThread = new Thread(instance01);
      myThread.start();
    }
  }
}