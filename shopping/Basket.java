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


//   public int initialValue() {
//     int total = 0;
//     for (Item item : contents) {
//       total += item.getValue();
//     }
//     return total;
//   }

//   public HashMap<Item, Integer> setUpItemFrequencies() {
//     HashMap<Item, Integer> countMap = new HashMap<>();
//     for (Item item : contents) {
//       Integer itemCount = Collections.frequency(contents, item);
//       countMap.put(item, itemCount);
//     }
//     return countMap;
//   }

//   public int bogofDiscount() {
//     int discount = 0;
//     HashMap<Item, Integer> countMap = setUpItemFrequencies();
//     for (Item item : contents) {
//       if (countMap.get(item) / 2 >= 1) {
//         discount += item.getValue();
//         countMap.put(item, (countMap.get(item) - 2));
//       }
//     }
//     return discount;
//   }

//   public int tenPercentOff(int total) {
//     if (total > 2000) {
//       int discount = (total / 10); 
//       return discount;
//     }
//     return 0;
//   }

//   public boolean customerHasLoyaltyCard() {
//     return true;
//   }

//   public int loyaltyDiscount(int total) {
//     if (customerHasLoyaltyCard()) {
//       int discount = (total / 100) * 2;
//       return discount;
//     }
//    return 0; 
//   }

//   public int finalTotal() {
//     int total = initialValue();
//     total -= bogofDiscount();
//     total -= tenPercentOff(total);
//     total -= loyaltyDiscount(total);
//     return total;
//   }

}