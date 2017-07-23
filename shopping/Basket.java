package shopping;
import java.util.ArrayList;

public class Basket {
  private ArrayList<Item> contents;

  public Basket() {
    this.contents = new ArrayList<>();
  }

  public ArrayList getContents() {
    return this.contents;
  }

}