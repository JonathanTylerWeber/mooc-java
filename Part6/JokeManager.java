package Part6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManager {
  public static void main(String[] args) {
    JokeManager manager = new JokeManager();
    Scanner scanner = new Scanner(System.in);

    UserInterface ui = new UserInterface(manager, scanner);
    ui.start();
  }

  private ArrayList<String> jokes;

  public JokeManager() {
    this.jokes = new ArrayList<>();
  }

  public void addJoke(String joke) {
    this.jokes.add(joke);
  }

  public String drawJoke() {
    if (this.jokes.isEmpty()) {
      return "Jokes are in short supply.";
    } else {
      Random random = new Random();
      int randomidx = random.nextInt(jokes.size());
      return this.jokes.get(randomidx);
    }
  }

  public void printJokes() {
    for (String joke : this.jokes) {
      System.out.println(joke);
    }
  }

}

class UserInterface {
  private JokeManager manager;
  private Scanner scanner;

  public UserInterface(JokeManager manager, Scanner scanner) {
    this.manager = manager;
    this.scanner = scanner;
  }

  public void start() {
    while (true) {
      System.out.println("end to stop, 1: add joke, 2: random joke, 3: print all");
      String input = scanner.nextLine();

      switch (input) {
        case "end":
          System.out.println("Bye!");
          return; 
        case "1":
          System.out.println("write joke to add");
          String newJoke = scanner.nextLine();
          manager.addJoke(newJoke);
          System.out.println("joke added");
          break;
        case "2":
          System.out.println(manager.drawJoke());
          break;
        case "3":
          manager.printJokes();
          break;
        default:
          System.out.println("Unknown command.");
      }

    }
  }

}
