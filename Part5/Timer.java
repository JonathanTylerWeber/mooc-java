package Part5;

public class Timer {
  
  public static class ClockHand {
      private int value;
      private int limit;

      public ClockHand(int limit) {
          this.limit = limit;
          this.value = 0;
      }

      public void advance() {
          this.value = this.value + 1;

          if (this.value >= this.limit) {
              this.value = 0;
          }
      }

      public int value() {
          return this.value;
      }

      public String toString() {
          if (this.value < 10) {
              return "0" + this.value;
          }

          return "" + this.value;
      }
  }

  public static class TimerImpl {
    private ClockHand seconds;
    private ClockHand hundSecs;

    public TimerImpl() {
      this.seconds = new ClockHand(60);
      this.hundSecs = new ClockHand(100);
    }

    public void advance() {
      this.hundSecs.advance();

      if (this.hundSecs.value() == 0) {
        this.seconds.advance();
      }
    }

    public String toString() {
      return seconds + ":" + hundSecs;
    }

  }

  public static void main(String[] args) {
    
    TimerImpl timer = new TimerImpl();

    while (true) {
        System.out.println(timer);
        timer.advance();

        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
    }

  }

}
