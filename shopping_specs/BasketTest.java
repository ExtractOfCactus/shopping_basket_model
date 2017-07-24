import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;
import java.util.ArrayList;

public class BasketTest{
  Basket basket;
  Milk milk;
  Bread bread;
  ChocolateBar chocolateBar;

  @Before
  public void before() {
    bread = new Bread("Warbaton's Toastie", 500, "White");
    milk = new Milk("Tesco whole milk", 400, "Full fat");
    chocolateBar = new ChocolateBar("Dairy Milk", 1600, "Milk chocolate");
    basket = new Basket(true);
  }

  @Test
  public void basketStartsEmpty() {
    assertEquals(0, basket.getContents().size());
  }

  @Test 
  public void canGetLoyaltyCard() {
    assertEquals(true, basket.getLoyaltyCard());
  }

  @Test
  public void canAddItemToBasket() {
    basket.add(milk);
    assertEquals(1, basket.getContents().size());
  }

  @Test
  public void canRemoveItemFromBasket() {
    basket.add(milk);
    basket.remove(milk);
    assertEquals(0, basket.getContents().size());
  }

  @Test
  public void canEmptyBasket() {
    basket.add(milk);
    basket.add(bread);
    basket.empty();
    assertEquals(true, basket.getContents().isEmpty());
  }

}