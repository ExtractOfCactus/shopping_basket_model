import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;
import java.util.ArrayList;

public class CheckoutTest{
  Basket basket;
  Milk milk;
  Bread bread;
  ChocolateBar chocolateBar;
  Checkout checkout;

  @Before
  public void before() {
    bread = new Bread("Warbaton's Toastie", 500, "White");
    milk = new Milk("Tesco whole milk", 400, "Full fat");
    chocolateBar = new ChocolateBar("Dairy Milk", 1600, "Milk chocolate");
    basket = new Basket(true);
    checkout = new Checkout(basket);
  }

  @Test
  public void canGetValueOfBasket() {
    basket.add(milk);
    basket.add(bread);
    assertEquals(900, checkout.initialValue());
  }

  @Test
  public void hasBogofDiscount() {
    basket.add(milk);
    basket.add(bread);
    basket.add(bread);
    basket.add(bread);
    assertEquals(500, checkout.bogofDiscount());
  }

  @Test
  public void canGetValueTotalDiscount() {
    basket.add(milk);
    basket.add(bread);
    basket.add(bread);
    basket.add(bread);
    basket.add(chocolateBar);
    assertEquals(350, checkout.tenPercentOff(checkout.initialValue()));
  }

  @Test
  public void canGetLoyaltyDiscount(){
    basket.add(milk);
    basket.add(bread);
    basket.add(bread);
    basket.add(bread);
    basket.add(chocolateBar);
    assertEquals(70, checkout.loyaltyDiscount(checkout.initialValue()));
  }

  @Test
  public void canGetFinalTotal() {
    basket.add(milk);
    basket.add(bread);
    basket.add(bread);
    basket.add(bread);
    basket.add(chocolateBar);
    assertEquals(2646, checkout.finalTotal());
  }
}