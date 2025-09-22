package Part5;

public class Money {
  public static void main(String[] args) {
    Money a = new Money(10,0);
    Money b = new Money(5,0);

    Money c = a.plus(b);

    System.out.println(a);  // 10.00e
    System.out.println(b);  // 5.00e
    System.out.println(c);  // 15.00e

    a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
    //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

    System.out.println(a);  // 25.00e
    System.out.println(b);  // 5.00e
    System.out.println(c);  // 15.00e
  }


  private final int euros;
  private final int cents;

  public Money(int euros, int cents) {
    this.euros = euros;
    this.cents = cents;
  }

  public int euros() {
    return euros;
  }

  public int cents() {
    return cents;
  }

  public Money plus(Money addition) {
    Money newMoney = new Money(
      this.euros + addition.euros,
      this.cents + addition.cents
    );
    return newMoney;
  }

  public String toString() {
    String zero = "";
    if (cents <= 10) {
        zero = "0";
    }

    return euros + "." + zero + cents + "e";
  }   

}
