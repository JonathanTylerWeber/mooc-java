package Part4;

public class Person {
  private String name;
  private int age;
  private int weight;
  private int height;

  public Person(String initialName) {
      this.age = 0;
      this.weight = 0;
      this.height = 0;
      this.name = initialName;
  }

  public void printPerson() {
    System.out.println(this.name + ", age " + this.age + " years");
  }

  public void growOlder() {
      this.age = this.age + 1;
  }

  public int returnAge() {
      return this.age;
  }

  public String getName() {
        return this.name;
    }

  public String toString() {
      return this.name + ", age " + this.age + " years";
  }
  // calling sout(objectName) essentially calls sout(objectName.toString())


  public void setHeight(int newHeight) {
      this.height = newHeight;
  }

  public void setWeight(int newWeight) {
      this.weight = newWeight;
  }

  public double bodyMassIndex() {
      double heigthPerHundred = this.height / 100.0;
      return this.weight / (heigthPerHundred * heigthPerHundred);
  }


}
