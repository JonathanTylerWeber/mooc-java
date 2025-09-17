import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
  
    // int number = 0;

    // while (true) {
    //     number = number + 1;
    //     if (number >= 5) {
    //         break;
    //     }
    //     if (number < 5) {
    //         continue;
    //     }
    //     System.out.print(number + " ");
    // }

    // System.out.print(number + " ");
  
    Scanner scanner = new Scanner(System.in);

    // while (true) {
    //   System.out.println("Enter a positive number, enter 0 to quit");

    //   int input = Integer.valueOf(scanner.nextLine());

    //   if (input < 0) {
    //     System.out.println("Unsuitable number");
    //   } else if (input > 0) {
    //     System.out.println(input);
    //   } else if (input == 0) {
    //     break;
    //   }

    // }



    // /////
    // System.out.println("Enter a number to count to");

    // int input = Integer.valueOf(scanner.nextLine());

    // for (int i = 0; i <= input; i++) {
    //   System.out.println(i);
    // }



    // /////
    // System.out.println("Enter a number to count to");

    // int input = Integer.valueOf(scanner.nextLine());
    // int sum = 0;

    // for (int i = 0; i <= input; i++) {
    //   sum += i;
    // }

    // System.out.println(sum);


    ///////
    // divide(6, 2);

    ///////
    // int number = 10;
    // modifyNumber(number);
    // System.out.println(number);

    ///////
    int answer =  greatest(2, 7, 3);
    System.out.println("Greatest: " + answer);

  }

  public static int greatest(int number1, int number2, int number3) {
    if (number1 > number2 && number1 > number3) {
      return number1;
    } else if (number2 > number1 && number2 > number3) {
      return number2;
    } else {
      return number3;
    }
  }

  public static void greet() {
    System.out.println("Greetings from the method world!");
  }

  public static void divide(int a, int b){
    System.out.println(a / b);
  }

  public static void modifyNumber(int number) {
    number = number - 4;
}

}
