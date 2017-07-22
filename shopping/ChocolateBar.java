package shopping;

public class ChocolateBar extends Item {
  private String type;

  public ChocolateBar(String brand, int value, String type) {
    super(brand, value);
    this.type = type;
  }
}