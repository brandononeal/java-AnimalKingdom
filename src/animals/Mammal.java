package animals;

public class Mammal extends Animal {
  public Mammal(String name, int yearDiscovered) {
    super(name, yearDiscovered);
  }
  
  @Override
  public String getMovement() {
    return "walk";
  }

  @Override
  public String getBreath() {
    return "lungs";
  }

  @Override
  public String getReproduction() {
    return "live births";
  }
}
