package shopping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Checkout {
  private Basket basket;

  public Checkout(Basket basket) {
    this.basket = basket;
  }

  public ArrayList<Item> basketContents() {
    return basket.getContents();
  }

  public int initialValue() {
    int total = 0;
    for (Item item : basketContents()) {
      total += item.getValue();
    }
    return total;
  }

  private HashMap<Item, Integer> setUpItemFrequencies() {
    HashMap<Item, Integer> countMap = new HashMap<>();
    for (Item item : basketContents()) {
      Integer itemCount = Collections.frequency(basketContents(), item);
      countMap.put(item, itemCount);
    }
    return countMap;
  }

  public int bogofDiscount() {
    int discount = 0;
    HashMap<Item, Integer> countMap = setUpItemFrequencies();
    for (Item item : basketContents()) {
      if (countMap.get(item) / 2 >= 1) {
        discount += item.getValue();
        countMap.put(item, (countMap.get(item) - 2));
      }
    }
    return discount;
  }

  public int tenPercentOff(int total) {
    if (total > 2000) {
      int discount = (total / 10); 
      return discount;
    }
    return 0;
  }

  public boolean customerHasLoyaltyCard() {
    return basket.getLoyaltyCard();
  }

  public int loyaltyDiscount(int total) {
    if (customerHasLoyaltyCard()) {
      int discount = (total / 100) * 2;
      return discount;
    }
    return 0; 
  }

  public int finalTotal() {
    int total = initialValue();
    total -= bogofDiscount();
    total -= tenPercentOff(total);
    total -= loyaltyDiscount(total);
    return total;
  }

}