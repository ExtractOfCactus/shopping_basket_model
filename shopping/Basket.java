package shopping;
import java.util.ArrayList;

public class Basket {
  private ArrayList<Item> contents;
  private Boolean loyaltyCard;

  public Basket(Boolean loyaltyCard) {
    this.contents = new ArrayList<>();
    this.loyaltyCard = loyaltyCard;

  }

  public ArrayList getContents() {
    return this.contents;
  }

  public Boolean getLoyaltyCard() {
    return this.loyaltyCard;
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