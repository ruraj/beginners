package np.com.rts.internship.beginners;

public class Animal {
  private String type;
  private String name;
  private int    legs;

  public Animal(String type, String name, int legs) {
    this.type = type;
    this.name = name;
    this.legs = legs;
  }

  public String getType() {
    return type;
  }
}

