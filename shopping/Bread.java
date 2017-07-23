package shopping;

public class Bread extends Item {
  private String type;

  public Bread(String name, int value, String type) {
    super(name, value);
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}