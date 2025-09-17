package Part3;

public class Arrays {
  public static void main(String[] args) {
    

    // An Array contains a limited amount of numbered spots (indices) for values. The length (or size) of an Array is the amount of these spots, i.e. how many values can you place in the Array. The values in an Array are called elements.

    // There are two ways to create an Array. In the first one you have to explicitly define the size upon the creating. This is how you create an Array to hold three integers:

    int[] numbers = new int[3];

    numbers[0] = 2;
    numbers[2] = 5;

    System.out.println(numbers[0]);
    System.out.println(numbers[2]);

    System.out.println(numbers.length);

    int[] numbers2 = {5, 1, 3, 4, 2};
    System.out.println(sumOfNumbersInArray(numbers2));

    //////
    /// Just like for Strings, there's also a shortcut to create an array. Here we create an array to hold 3 integers, and initiate it with values 100, 1 and 42 in it:

    // int[] nums= {100, 1, 42};


  }

  public static int sumOfNumbersInArray(int[] array){
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }
}
