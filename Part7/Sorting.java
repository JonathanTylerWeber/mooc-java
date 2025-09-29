package Part7;

import java.util.Arrays;

public class Sorting {
  public static void main(String[] args) {
    // int[] numbers = {6, 5, 8, 7, 11};
    // System.out.println("Smallest: " + MainProgram.smallest(numbers));

    // int[] numbers = {6, 5, 8, 7, 11};
    // System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

    // int[] numbers = {-1, 6, 9, 8, 12};
    // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
    // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
    // System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

    // int[] numbers = {3, 2, 5, 4, 8};

    // System.out.println(Arrays.toString(numbers));

    // MainProgram.swap(numbers, 1, 0);
    // System.out.println(Arrays.toString(numbers));

    // MainProgram.swap(numbers, 0, 3);
    // System.out.println(Arrays.toString(numbers));

    int[] numbers = {8, 3, 7, 9, 1, 2, 4};
    MainProgram.sort(numbers);
  }

  public class MainProgram {

    public static int smallest(int[] array){
      int smallest = array[0];

      for (int i : array) {
        if (smallest > i) {
          smallest = i;
        }
      }

      return smallest;
    }

    public static int indexOfSmallest(int[] array){
      int smallestNum = array[0];
      int smallestIdx = 0;

      for (int i = 0; i < array.length; i++) {
        if (smallestNum > array[i]) {
          smallestNum = array[i];
          smallestIdx = i;
        }
      }

      return smallestIdx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
      int smallestNum = table[startIndex];
      int smallestIdx = startIndex;

      for (int i = startIndex; i < table.length; i++) {
        if (smallestNum > table[i]) {
          smallestNum = table[i];
          smallestIdx = i;
        }
      }

      return smallestIdx;
    }  

    public static void swap(int[] array, int index1, int index2) {
      int index1Val = array[index1];
      array[index1] = array[index2];
      array[index2] = index1Val;
    }
    

    public static void sort(int[] array) {
      System.out.println(Arrays.toString(array));
      for (int i = 0; i < array.length; i++) {
        int smallestIdx = indexOfSmallestFrom(array, i);
        swap(array, i, smallestIdx);
        System.out.println(Arrays.toString(array));
      }
    }
  }
}
