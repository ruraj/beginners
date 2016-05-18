package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  ArrayList<Animal> originalList = new ArrayList<Animal>() {{
    add(new Herbivore("lamb", 4));
    add(new Herbivore("cow", 4));
    add(new Herbivore("giraffe", 4));
    add(new Carnivore("lion", 4));
    add(new Carnivore("bear", 4));
    add(new Carnivore("leopard", 4));
    add(new Carnivore("panther", 4));
    add(new Omnivore("human", 2));
  }};

  ArrayList<Herbivore> herbivores = new ArrayList<>();
  ArrayList<Carnivore> carnivores = new ArrayList<>();
  ArrayList<Omnivore> omnivores = new ArrayList<>();

  public Main() {
    // Write your code here


  }
  public static void main(String[] args) {
    new Main();
  }
}
