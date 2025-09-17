package Part3;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[] args) {
      

      ///////////

      ArrayList<Integer> intList = new ArrayList<>();
      intList.add(1);

      ArrayList<Double> doubleList = new ArrayList<>();
      doubleList.add(1.1);

      ArrayList<Boolean> boolList = new ArrayList<>();
      boolList.add(true);

      ArrayList<String> stringList = new ArrayList<>();
      stringList.add("hello");


      // 
      // Once a list has been created, ArrayList assumes that all the variables contained in it are reference types. Java automatically converts an int variable into Integer when one is added to a list, and the same occurs when a variable is retrieved from a list. The same conversion occurs for double-type variables, which are converted to Double. This means that even though a list is defined to contain Integer-type variables, variables of type int can also be added to it.
      ArrayList<Integer> integers = new ArrayList<>();
      int integer = 1;
      integers.add(integer);
      // 


      // create the word list for storing strings
        ArrayList<String> wordList = new ArrayList<>();

      // add two values to the word list
      wordList.add("First");
      wordList.add("Second");

      // retrieve the value from position 0 of the word list, and print it
      // System.out.println(wordList.get(0));



      // addSecondAndThirdNums();

      // alwaysOutOfBounds();
      
      // giveListSize();


      //////////
      ArrayList<String> teachers = new ArrayList<>();

      teachers.add("Simon");
      teachers.add("Samuel");
      teachers.add("Ann");
      teachers.add("Anna");

      // int index = 0;
      // Repeat for as long as the value of the variable `index`
      // is smaller than the size of the teachers list
      // while (index < teachers.size()) {
      //     System.out.println(teachers.get(index));
      //     index = index + 1;
      // }

      // for (int i = 0; i < teachers.size(); i++) {
      //     System.out.println(teachers.get(i));
      // }


      ///////
      /// 
      // ArrayList<Integer> numbers = new ArrayList<>();

      // numbers.add(1);
      // numbers.add(2);
      // numbers.add(3);
      // numbers.add(4);

      // int ind = numbers.size() - 1;
      // while (ind >= 0) {
      //     int number = numbers.get(ind);
      //     System.out.println(number);
      //     ind = ind - 1;
      // }



      // printFirstAndLast();

      // findGreatest();


      ///////
      /// for each
      ArrayList<String> teachers2 = new ArrayList<>();


      teachers2.add("Simon");
      teachers2.add("Samuel");
      teachers2.add("Ann");
      teachers2.add("Anna");

      for (String teacher: teachers2) {
          System.out.println(teacher);
      }


      // The list's remove method removes the value that is located at the index 
      // that's given as the parameter. The parameter is an integer.
      ArrayList<String> list = new ArrayList<>();

      list.add("First");
      list.add("Second");
      list.add("Third");

      list.remove(1);
      list.remove("First");


      ///////
      // ArrayList<Integer> list = new ArrayList<>();

      // To remove an integer type value you can convert the parameter to Integer type; this is achieved by the valueOf method of the Integer class.
      // list.add(15);
      // list.add(18);
      // list.add(21);
      // list.add(24);

      // list.remove(2);
      // list.remove(Integer.valueOf(15));



      //////
      /// The list method contains can be used to check the existence of a value in the list. The method receives the value to be searched as its parameter, and it returns a boolean type value (true or false) that indicates whether or not that value is stored in the list.

      // ArrayList<String> list = new ArrayList<>();

      // list.add("First");
      // list.add("Second");
      // list.add("Third");

      // System.out.println("Is the first found? " + list.contains("First"));

      boolean found = list.contains("Second");
      if (found) {
          System.out.println("Second was found");
      }

      // or more simply
      if (list.contains("Second")) {
          System.out.println("Second can still be found");
      }





      //////
    }

    static void addSecondAndThirdNums(){
      Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> intList2 = new ArrayList<>();
      System.out.println("enter numbers, 0 to exit. 2nd and 3rd number will be added and returned");
      while (true) {
        int input = scanner.nextInt();
        if (input == 0) {
          break;
        } else {
          intList2.add(input);
        }
      }
      System.out.println(intList2.get(1) + intList2.get(2));
      scanner.close();
    }

    static void alwaysOutOfBounds(){
      Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> intList2 = new ArrayList<>();
      System.out.println("enter numbers, 0 to exit. 2nd and 3rd number will be added and returned");
      while (true) {
        int input = scanner.nextInt();
        if (input == 0) {
          break;
        } else {
          intList2.add(input);
        }
      }
      System.out.println(intList2.get(intList2.size() + 1));
      scanner.close();
    }

    static void giveListSize() {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>();
      System.out.println("enter strings, 'stop' to quit");
      while (true) {
        String input = scanner.nextLine();
        if (input.equals("stop")) {
          break;
        } else {
          list.add(input);
        }
      }
      System.out.println(list.size());
      scanner.close();
    }

    static void printFirstAndLast() {
      Scanner scanner = new Scanner(System.in);
      ArrayList<String> list = new ArrayList<>();
      System.out.println("enter strings, 'stop' to quit");
      while (true) {
        String input = scanner.nextLine();
        if (input.equals("stop")) {
          break;
        } else {
          list.add(input);
        }
      }
      System.out.println("first: " + list.get(0) + ", last: " + list.get(list.size() - 1));
      scanner.close();
    }

    static void findGreatest(){
      Scanner scanner = new Scanner(System.in);
      ArrayList<Integer> intList2 = new ArrayList<>();
      System.out.println("enter numbers, 0 to exit. prints greatest");
      while (true) {
        int input = scanner.nextInt();
        if (input == 0) {
          break;
        } else {
          intList2.add(input);
        }
      }
      
      int greatest = 0;

      for (int i = 0; i < intList2.size(); i++) {
        if (intList2.get(i) > greatest) {
          greatest = intList2.get(i);
        }
      }

      System.out.println(greatest);
      
      scanner.close();
    }

  }
