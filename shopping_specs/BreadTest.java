import static org.junit.Assert.*;
import org.junit.*;
import shopping.*;

public class BreadTest {
  Bread bread;

  @Before
  public void before() {
    bread = new Bread("Warbaton's Toastie", 5, "White");
  }

  @Test
  public void canGetBreadName() {
    assertEquals("Warbaton's Toastie", bread.getName());
  }

  @Test 
  public void canGetValue() {
    assertEquals(5, bread.getValue());
  }

  @Test
  public void canSetValue() {
    bread.setValue(2);
    assertEquals(2, bread.getValue());
  }

  @Test
  public void canGetType() {
    assertEquals("White", bread.getType());
  }
}