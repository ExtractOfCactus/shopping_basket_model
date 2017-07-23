import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;
import java.util.ArrayList;

public class BasketTest{
  Basket basket;

  @Before
  public void before() {
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
    assertEquals(1, basket.getContents.size());
  }
}