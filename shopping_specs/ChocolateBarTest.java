import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class ChocolateBarTest {
  ChocolateBar chocolateBar;

  @Before
  public void before() {
    chocolateBar = new ChocolateBar("Dairy Milk", 3, "Milk chocolate");
  }

  @Test
  public void canGetName() {
    assertEquals("Dairy Milk", chocolateBar.getName());
  }

  @Test
  public void canGetValue() {
    assertEquals(3, chocolateBar.getValue());
  }
}