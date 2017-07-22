package shopping;

public class Milk extends Item {
  private String fatContent;

  public Milk(String brand, int value, String fatContent) {
    super(brand, value);
    this.fatContent = fatContent;
  }
}