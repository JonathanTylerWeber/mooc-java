package Part6;

import java.util.ArrayList;

public class CargoHold {
  public static void main(String[] args) {
    // Item book = new Item("The lord of the rings", 2);
    // Item phone = new Item("Nokia 3210", 1);

    // System.out.println("The book's name: " + book.getName());
    // System.out.println("The book's weight: " + book.getWeight());

    // System.out.println("Book: " + book);
    // System.out.println("Phone: " + phone);


    // Item book = new Item("Lord of the rings", 2);
    // Item phone = new Item("Nokia 3210", 1);
    // Item brick = new Item("brick", 4);

    // Suitcase suitcase = new Suitcase(5);
    // System.out.println(suitcase);

    // suitcase.addItem(book);
    // System.out.println(suitcase);

    // suitcase.addItem(phone);
    // System.out.println(suitcase);

    // suitcase.addItem(brick);
    // System.out.println(suitcase);


    // Item book = new Item("Lord of the rings", 2);
    // Item phone = new Item("Nokia 3210", 1);
    // Item brick = new Item("brick", 4);

    // Suitcase suitcase = new Suitcase(10);
    // suitcase.addItem(book);
    // suitcase.addItem(phone);
    // suitcase.addItem(brick);

    // System.out.println("The suitcase contains the following items:");
    // suitcase.printItems();
    // System.out.println("Total weight: " + suitcase.totalWeight() + " kg");


    // Item book = new Item("Lord of the rings", 2);
    // Item phone = new Item("Nokia 3210", 1);
    // Item brick = new Item("Brick", 4);

    // Suitcase suitcase = new Suitcase(10);
    // suitcase.addItem(book);
    // suitcase.addItem(phone);
    // suitcase.addItem(brick);

    // Item heaviest = suitcase.heaviestItem();
    // System.out.println("Heaviest item: " + heaviest);


    // Item book = new Item("Lord of the rings", 2);
    //     Item phone = new Item("Nokia 3210", 1);
    //     Item brick = new Item("brick", 4);

    //     Suitcase adasCase = new Suitcase(10);
    //     adasCase.addItem(book);
    //     adasCase.addItem(phone);

    //     Suitcase pekkasCase = new Suitcase(10);
    //     pekkasCase.addItem(brick);

    //     Hold hold = new Hold(1000);
    //     hold.addSuitcase(adasCase);
    //     hold.addSuitcase(pekkasCase);

    //     System.out.println(hold);


    Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
  }
}

class Item {
  private String name;
  private int weight;

  public Item (String name, int weight ) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return this.name;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return name + " (" + weight + " kg)";
  }

}

class Suitcase {
  private ArrayList<Item> items;
  private int maxWeight;

  public Suitcase(int maxWeight) {
    this.maxWeight = maxWeight;
    this.items = new ArrayList<>();
  }

  public int totalWeight() {
    int weight = 0;
    for (Item item : items) {
      weight += item.getWeight();
    }
    return weight;
  }

  public void addItem(Item item) {
    if ((item.getWeight() + this.totalWeight()) > this.maxWeight) {
      return;
    }
    this.items.add(item);
  }

  public void printItems() {
    for (Item item : items) {
      System.out.println(item);
    }
  }

  public Item heaviestItem() {
    if (items.isEmpty()) {
      return null;
    }

    Item heaviest = this.items.get(0);
    for (Item item : this.items) {
      if(item.getWeight() > heaviest.getWeight()){
        heaviest = item;
      }
    }
    return heaviest;

  }

  public String toString() {
    if (items.size() == 0) {
      return "no items (0 kg)";
    } else if (items.size() == 1) {
      return "1 item (" + this.totalWeight() + " kg)";
    } else {
      return items.size() + " items (" + this.totalWeight() + " kg)";
    }
  }

}

class Hold {
  private int maxWeight;
  private ArrayList<Suitcase> suitcases;

  public Hold(int maxWeight) {
    this.maxWeight = maxWeight;
    this.suitcases = new ArrayList<>();
  }

  public void addSuitcase(Suitcase suitcase) {
    if (suitcase.totalWeight() + this.totalWeight() > this.maxWeight) {
      return;
    }
    this.suitcases.add(suitcase);
  }

  public int totalWeight() {
    int weight = 0;
    for (Suitcase suitcase : suitcases) {
      weight += suitcase.totalWeight();
    }
    return weight;
  }

  public void printItems() {
    for (Suitcase suitcase : suitcases) {
      suitcase.printItems();
    }
  }

  public String toString() {
    return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
  }
  
}