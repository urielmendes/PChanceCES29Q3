import static org.junit.Assert.*;

import org.junit.Test;

public class MatematicaTest {
  
  Matematica mat = new Matematica();

  @Test
  public void testResults() {
    assertEquals(mat.fibonacci(7),13);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void invalidArgumentTest() {
    mat.fibonacci(-3);
  }

}
