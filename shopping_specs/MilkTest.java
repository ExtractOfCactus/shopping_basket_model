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
}