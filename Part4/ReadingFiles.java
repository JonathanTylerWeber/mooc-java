package Part4;

import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingFiles {

  // static boolean isOnList(String fileName, String name) {
  //     try (Scanner file = new Scanner(Paths.get(fileName))) {

  //         while (file.hasNextLine()) {
  //             String row = file.nextLine().trim();
  //             if (row.equals(name)) {
  //               return true;
  //             }
  //         }
  //         return false;
  //     } catch (Exception e) {
  //         System.out.println("Error: " + e.getMessage());
  //         return false;
  //     }
  //   }

  static String printTeamInfo(String fileName, String team) {
      try (Scanner file = new Scanner(Paths.get(fileName))) {
          int games = 0;

          while (file.hasNextLine()) {
              String row = file.nextLine();
              String[] parts = row.split(",");
              if(parts[0].equals(team)){
                games ++;
              }
          }
          return "Games: " + games;

      } catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
          return "error";
      }
    }
  
  public static void main(String[] args) {
    
    // // we create a scanner for reading the file
    // try (Scanner scanner = new Scanner(Paths.get("file.txt"))) {

    //     // we read the file until all lines have been read
    //     while (scanner.hasNextLine()) {
    //         // we read one line
    //         String row = scanner.nextLine();
    //         // we print the line that we read
    //         System.out.println(row);
    //     }
    // } catch (Exception e) {
    //     System.out.println("Error: " + e.getMessage());
    // }

    

    
    // try (Scanner in = new Scanner(System.in)) {

    //     System.out.print("Enter file name: ");
    //     String fileName = in.nextLine().trim();

    //     while (true) {
    //         System.out.print("Enter name, 'end' to stop: ");
    //         String name = in.nextLine().trim();

    //         if (name.equalsIgnoreCase("end")) {   // not ==
    //             break;
    //         }

    //         System.out.println(isOnList(fileName, name));

    //     }
    // }


    try (Scanner in = new Scanner(System.in)) {

        System.out.print("Enter file name: ");
        String fileName = in.nextLine().trim();

        while (true) {
            System.out.print("Enter team, 'end' to stop: ");
            String team = in.nextLine().trim();

            if (team.equalsIgnoreCase("end")) {   
                break;
            }

            System.out.println(printTeamInfo(fileName, team));
            
        }
    }

  }
}
