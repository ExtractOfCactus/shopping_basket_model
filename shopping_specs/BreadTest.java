import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class BreadTest {
  Bread bread;

  @Before
  public void before() {
    bread = new Bread("Warbaton's", 2, "White");
  }

  @Test
  public void canGetBreadBrand() {
    assertEquals("Warbaton's", bread.getBrand());
  }

  @Test 
  public void canGetValue() {
    assertEquals(2, bread.getValue());
  }

  @Test
  public void canGetType() {
    assertEquals("White", bread.getType());
  }
}