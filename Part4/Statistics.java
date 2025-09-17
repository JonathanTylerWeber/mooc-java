package Part4;

public class Statistics {
    private int count;

    public Statistics() {
    }

    public void addNumber(int number) {
      this.count = this.count + 1;
    }

    public int getCount() {
      return this.count;
    }
}
