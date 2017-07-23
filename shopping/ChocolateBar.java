package shopping;

public class ChocolateBar extends Item {
  private String type;

  public ChocolateBar(String name, int value, String type) {
    super(name, value);
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}