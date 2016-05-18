FILTER
===

This problem tests your knowledge of Java lists and simple use of Java class objects. Advanced version also tests knowledge of inheritance.

Basic version
---

We have a simple class as follows:
``` java
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
```
We have an ArrayList of objects of class Animal. The problem is to filter this single array into multiple arrays, each containing a specific type of animal. For eg, "type" may be "herbivore", "carnivore", "omnivore". So we basically need three new arrays:

``` java
ArrayList<Animal> herbivores;
ArrayList<Animal> carnivores;
ArrayList<Animal> omnivores;
```

each containing only that type of animal.


Advanced version
---

We have a super class and child classes as follows:
``` java
public abstract class Animal {
  private String name;
  private int    legs;

  public Animal(String name, int legs) {
    this.name = name;
    this.legs = legs;
  }
}

public class Herbivore extends Animal {
}

public class Carnivore extends Animal {
}

public class Onnivore extends Animal {
}
```
The problem is the same as basic version, but this time, the filtered arrays would be:
``` java
ArrayList<Herbivore> herbivores;
ArrayList<Carnivore> carnivores;
ArrayList<Omnivore> omnivores;
```



