package Part4;

import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class OOP {

  public static void main(String[] args) {


    // Class vs Object: Class = blueprint; Object = instance with its own state (field values).

    // Fields & Encapsulation: Use private fields to hide state; expose behavior via methods (getters/setters).

    // Constructors: new Class(args) initializes object state; if none defined, Java provides a default no-arg constructor (until you add your own).

    // Methods: Define behavior; can be void or return values; may call other methods and use conditionals/loops.

    // Static vs Instance: static methods don’t belong to an object; instance methods operate on this object/state.

    // toString(): Preferred over custom print methods—returns a string representation; System.out.println(obj) calls obj.toString() implicitly.

    // Floating-Point Note: double can show rounding artifacts; for money, prefer integer cents.



    // ********************

    // Person ada = new Person("Ada");
    // Person antti = new Person("Antti");
    // Person martin = new Person("Martin");

    // ada.printPerson();
    // antti.printPerson();
    // martin.printPerson();

    // Whistle duckWhistle = new Whistle("Kvaak");
    // Whistle roosterWhistle = new Whistle("Peef");

    // duckWhistle.sound();
    // roosterWhistle.sound();
    // duckWhistle.sound();

    // Product banana = new Product("banana", 13, 1.1);
    // banana.printProduct();




    // Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

    // Scanner reader = new Scanner(System.in);

    // System.out.println("How old are you?");
    // int age = Integer.valueOf(reader.nextLine());

    // System.out.println();
    // if (age >= chipmunks.ageRating()) {
    //     System.out.println("You may watch the film " + chipmunks.name());
    // } else {
    //     System.out.println("You may not watch the film " + chipmunks.name());
    // }



    Statistics statistics = new Statistics();
    statistics.addNumber(3);
    statistics.addNumber(5);
    statistics.addNumber(1);
    statistics.addNumber(2);
    System.out.println("Count: " + statistics.getCount());


  }
  
}
