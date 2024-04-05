package chapters.two.quiz.two;

// Anonymous class puzzler
public class MeaningOfThis {

  // What will the output be when this code is executed: 4, 5, 6, or 42?

  public final int value = 4;

  public void doIt() {
    int value = 6;

    Runnable runnable = new Runnable() {
      public final int value = 5;
      @Override
      public void run() {
        int value = 10;
        System.out.println(this.value);
      }
    };
    runnable.run();
  }

  public static void main(String[] args) {
    MeaningOfThis meaningOfThis = new MeaningOfThis();
    meaningOfThis.doIt();
  }
}
