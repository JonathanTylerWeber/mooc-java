package Part6;

import java.util.ArrayList;

public class SimpleCollection {
  public static void main(String[] args) {
    // SimpleCollection s = new SimpleCollection("alphabet");
    // System.out.println(s);

    // System.out.println();

    // s.add("a");
    // System.out.println(s);

    // System.out.println();

    // s.add("b");
    // System.out.println(s);

    // System.out.println();

    // s.add("c");
    // System.out.println(s);

    SimpleCollection j = new SimpleCollection("characters");
    System.out.println("Longest: " + j.longest());

    j.add("magneto");
    j.add("mystique");
    j.add("phoenix");

    System.out.println("Longest: " + j.longest());
  }

  private ArrayList<String> values;
  private String name;

  public SimpleCollection(String name) { 
    this.values = new ArrayList<>();
    this.name = name;
  }

  public void add(String value) {
    this.values.add(value);
  }

  public String toString() {
    String output = "";

    if (values.size() == 0) {
      output = "The collection " + this.name + " is empty.";
    } else if(values.size() == 1) {
      output = "The collection " + this.name + " has 1 element \n";
    } else {
      output = "The collection " + this.name + " has " + values.size() + " elements \n";
    }

    for (String value : values) {
      output = output + value + "\n";
    }
    return output;
  }

  public String longest() {
    if (values.isEmpty()) {
      return null;
    }

    String longest = this.values.get(0);

    for (String value : this.values) {
      if (value.length() > longest.length()) {
        longest = value;
      }
    }
    
    return longest;
  }

}
