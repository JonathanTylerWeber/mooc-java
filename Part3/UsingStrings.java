package Part3;

import java.util.Scanner;

public class UsingStrings {
  public static void main(String[] args) {
    // Strings can't be compared with with the equals operator - ==. For strings, there exists a separate equals-command, which is always appended to the end of the string that we want to compare.

    // String words = "course";

    // if (words.equals("marzipan")) {
    //     System.out.println("The text variable contains the text marzipan.");
    // } else {
    //     System.out.println("The text variable does not contain the text marzipan.");
    // }



    // You can split a string to multiple pieces with the split-method of the String class. The method takes as a parameter a string denoting the place around which the string should be split. The split method returns an array of the resulting sub-parts. In the example below, the string has been split around a space.

    // String text = "first second third fourth";
    // String[] pieces = text.split(" ");
    // System.out.println(pieces[0]);
    // System.out.println(pieces[1]);
    // System.out.println(pieces[2]);
    // System.out.println(pieces[3]);

    // System.out.println();

    // for (int i = 0; i < pieces.length; i++) {
    //     System.out.println(pieces[i]);
    // }



    containsAv("Do you have a favorite flavor");



    String text = "Hello world!";
    char character = text.charAt(0);
    System.out.println(character);

    ageOfOldest();

  }

  static void containsAv(String str){
    String[] splitStr = str.split(" ");
    for (String string : splitStr) {
      if (string.contains("av")){
        System.out.println(string);
      }
    }
  }

  static void ageOfOldest(){
    Scanner reader = new Scanner(System.in);
    int oldest = 0;

    while (true) {
        String input = reader.nextLine();
        if (input.equals("")) {
            break;
        }

        String[] parts = input.split(",");
        if(Integer.valueOf(parts[1]) > oldest){
          oldest = Integer.valueOf(parts[1]);
        }
    }

    System.out.println(oldest);
    reader.close();
  }

}
