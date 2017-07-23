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
    bread = new Bread("Warbaton's Toastie", 5, "White");
    milk = new Milk("Tesco whole milk", 4, "Full fat");
    chocolateBar = new ChocolateBar("Dairy Milk", 16, "Milk chocolate");
    basket = new Basket();
  }

  @Test
  public void basketStartsEmpty() {
    assertEquals(0, basket.getContents().size());
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

  @Test
  public void canGetValueOfBasket() {
    basket.add(milk);
    basket.add(bread);
    assertEquals(9, basket.initialValue());
  }

  @Test
  public void hasBogofDiscount() {
    basket.add(milk);
    basket.add(bread);
    basket.add(bread);
    basket.add(bread);
    assertEquals(19, basket.initialValue());
    assertEquals(14, basket.bogofDiscount());
  }

  @Test
  public void canGetValueTotalDiscount() {
    basket.add(milk);
    basket.add(bread);
    basket.add(bread);
    basket.add(bread);
    basket.add(chocolateBar);
    assertEquals(27, basket.tenPercentOff());
  }
}