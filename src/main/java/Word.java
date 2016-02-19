import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> words = new ArrayList<Word>();

  private String mInput;
  private int mId;
  private String mDefinition;
  private ArrayList<Definition> mDefinitions;

  public Word(String input) {
    mInput = input;
    words.add(this);
    mId = words.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public String getInput() {
    return mInput;
  }

  public int getId() {
    return mId;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

  public static ArrayList<Word> all() {
    return words;
  }

  public static void clear() {
    words.clear();
  }

  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }

  public static Word find(int id) {
    try {
      return words.get(id-1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
}
