import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("defexample");
    assertEquals(true, myDefinition instanceof Definition);
  }

  public void definition_instantiatesWithDef_true() {
    Definition myDefinition = new Definition("defexample");
    assertEquals("defexample", myDefinition.getDef());
  }
}
