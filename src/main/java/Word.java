import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> words = new ArrayList<Word>();

  private String mInput;
  private int mId;

  public Word(String input) {
    mInput = input;
    words.add(this);
    mId = words.size();
  }

  public String getInput() {
    return mInput;
  }

  public int getId() {
    return mId;
  }

  public static ArrayList<Word> all() {
    return words;
  }
}
