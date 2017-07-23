package shopping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

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


  public int initialValue() {
    int total = 0;
    for (Item item : contents) {
      total += item.getValue();
    }
    return total;
  }

  public HashMap<Item, Integer> setUpItemFrequencies() {
    HashMap<Item, Integer> countMap = new HashMap<>();
    for (Item item : contents) {
      Integer itemCount = Collections.frequency(contents, item);
      countMap.put(item, itemCount);
    }
    return countMap;
  }

  public int bogofDiscount() {
    int newValue = initialValue();
    HashMap<Item, Integer> countMap = setUpItemFrequencies();
    for (Item item : contents) {
      int discounter = 0;
      if (countMap.get(item) / 2 >= 1) {
        newValue -= item.getValue();
        countMap.put(item, (countMap.get(item) - 2));
      }
    }
    return newValue;
  }

  public int tenPercentOff() {
    int newValue = bogofDiscount();
    if (newValue > 2000) {
      newValue -= (newValue / 10); 
    }
    return newValue;
  }

  public boolean customerHasLoyaltyCard() {
    return true;
  }

  public int loyaltyDiscount() {
    int newValue = tenPercentOff();
    if (customerHasLoyaltyCard()) {
      int discount = (newValue / 100) * 2;
      newValue -= discount;
    }
    return newValue;
  }

}