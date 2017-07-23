import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;
import java.util.ArrayList;

public class BasketTest{
  Basket basket;
  Milk milk;
  Bread bread;

  @Before
  public void before() {
    bread = new Bread("Warbaton's Toastie", 5, "White");
    milk = new Milk("Tesco whole milk", 5, "Full fat");
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
}