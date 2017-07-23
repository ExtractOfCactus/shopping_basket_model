package shopping;

public class Milk extends Item {
  private String fatContent;

  public Milk(String name, int value, String fatContent) {
    super(name, value);
    this.fatContent = fatContent;
  }
}