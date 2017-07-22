package shopping;

public class Bread extends Item {
  String type;

  public Bread(String brand, int value, String type) {
    super(brand, value);
    this.type = type;
  }
}