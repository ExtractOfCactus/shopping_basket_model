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

  public void add(Item item) {
    contents.add(item);
  }

  public void remove(Item item) {
    contents.remove(item);
  }

  public void empty() {
    contents.clear();
  }

}