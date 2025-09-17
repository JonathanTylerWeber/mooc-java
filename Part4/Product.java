package Part4;

public class Product {
  private double price;
  private int quantity;
  private String name;

  public Product(String initName, int initQuantity, double initPrice){
    this.name = initName;
    this.quantity = initQuantity;
    this.price = initPrice;
  }

  public void printProduct() {
    System.out.println(this.name + ", price: " + this.price + ", " + this.quantity + " pcs");
  }

}
