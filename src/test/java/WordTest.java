import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word myWord = new Word("example");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void word_intantiatesWithLocation_true() {
    Word myWord = new Word("example");
    assertEquals("example", myWord.getInput());
  }
}
