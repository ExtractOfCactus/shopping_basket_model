import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class MilkTest {
  Milk milk;

  @Before
  public void before() {
    milk = new Milk("Tesco whole milk", 5, "Full fat");
  }

  @Test
  public void canGetName() {
    assertEquals("Tesco whole milk", milk.getName());
  }

  @Test
  public void canGetValue() {
    assertEquals(5, milk.getValue());
  }

  @Test
  public void canGetFatContent() {
    assertEquals("Full fat", milk.getFatContent());
  }
}