package shopping;

public abstract class Item {
  protected String brand;
  protected int value;

  public Item(String brand, int value) {
    this.brand = brand;
    this.value = value;
  }

  public String getBrand() {
    return this.brand;
  }

  public int getValue() {
    return this.value;
  }

}