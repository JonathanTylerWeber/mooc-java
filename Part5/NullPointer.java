package Part5;

public class NullPointer {

  public static void main(String[] args) {
    Cat kali = new Cat("Kali");
    System.out.println(kali.getName());
    kali = null;
    System.out.println(kali.getName());
  }

}

class Cat {
    private String name;
    
    public Cat(String name) {
      this.name = name;
    }

    public String getName(){
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
