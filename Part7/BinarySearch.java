package Part7;

public class BinarySearch {
  public static int binarySearch(int[] list, int searched) {
    int begin = 0;
    int end = list.length - 1;

    while (begin <= end) {
      int middle = (end + begin) / 2;

      if (list[middle] == searched) {
        return middle;
      }

      if (list[middle] < searched) {
        begin = middle + 1;
      }

      if (list[middle] > searched) {
        end = middle - 1;
      }

    }
    return -1;
  }
  
}
