package Part5;

public class Apartment {
  public static void main(String[] args) {
    Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
    Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
    Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

    System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
    System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
  }

  private int rooms;
  private int squares;
  private int pricePerSquare;

  public Apartment(int rooms, int squares, int pricePerSquare) {
      this.rooms = rooms;
      this.squares = squares;
      this.pricePerSquare = pricePerSquare;
  }

  public boolean largerThan(Apartment compared) {
    return this.squares > compared.squares;
  }


  
}
