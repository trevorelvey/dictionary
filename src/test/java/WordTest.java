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

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("example");
    Word secondWord = new Word("example2");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void newId_wordInstantiatesWithAnID_true() {
    Word myWord = new Word ("example");
    assertEquals(Word.all().size(), myWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("example");
    Word secondWord = new Word("example2");
    assertEquals(Word.find(secondWord.getId()), secondWord);
  }

  @Test
  public void find_returnsNullWhenNoWordFound_null() {
    assertTrue(Word.find(999) == null);
  }

  @Test
    public void clear_emptiesAllWordFromArrayList() {
      Word myWord = new Word("example");
      Word.clear();
      assertEquals(Word.all().size(), 0);
    }

  @Test
    public void addTask_addsDefinitionToWordList() {
      Word testWord = new Word("example");
      Definition testDefinition = new Definition("defexample");
      testWord.addDefinition(testDefinition);
      assertTrue(testWord.getDefinitions().contains(testDefinition));
    }
}
