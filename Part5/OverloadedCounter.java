package Part5;

public class OverloadedCounter {
  // instance variables
  private int value;

  // constructor overload
  public OverloadedCounter(int value) {
    this.value = value;
  }

  public OverloadedCounter() {
    this.value = 0;
  }

  // ******** This is equivalent to above constructor
  // public OverloadedCounter() {
  //   new OverloadedCounter(0);
  // }

  // methods
  public int value() {
    return this.value;
  }

  public void increase() {
    this.value += 1;
  }

  public void decrease() {
    this.value -= 1;
  }

  // method overload
  public void increase(int increaseBy) {
    this.value += increaseBy;
  }

  public void decrease(int decreaseBy) {
    this.value -= decreaseBy;
  }

}
