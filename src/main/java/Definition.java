import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();

  private String mDef;
  private int mId;

  public Definition(String def) {
    mDef = def;
    instances.add(this);
    mId = instances.size();
  }

  public String getDef() {
    return mDef;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }


}
