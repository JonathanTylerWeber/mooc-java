package Part6;

import java.util.ArrayList;

public class Stack {
  public static void main(String[] args) {
    // Stack s = new Stack();
    // System.out.println(s.isEmpty());
    // System.out.println(s.values());
    // s.add("Value");
    // System.out.println(s.isEmpty());
    // System.out.println(s.values());
    // String taken = s.take();
    // System.out.println(s.isEmpty());
    // System.out.println(s.values());
    // System.out.println(taken);

    Stack s = new Stack();
    s.add("1");
    s.add("2");
    s.add("3");
    s.add("4");
    s.add("5");

    while (!s.isEmpty()) {
        System.out.println(s.take());
    }

  }

  private ArrayList<String> strings;

  public Stack() {
    this.strings = new ArrayList<>();
  }

  public boolean isEmpty() {
    return this.strings.size() == 0;
  }

  public void add(String value) {
    this.strings.add(value);
  }

  public ArrayList<String> values() {
    return this.strings;
  }

  public String take() {
    int top = this.strings.size() - 1;
    return this.strings.remove(top);
  }

}
