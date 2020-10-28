package animals;

public class Bird extends Animal {
  public Bird(String name, int yearDiscovered) {
    super(name, yearDiscovered);
  }

  @Override
  public String getMovement() {
    return "fly";
  }

  @Override
  public String getBreath() {
    return "lungs";
  }

  @Override
  public String getReproduction() {
    return "eggs";
  }
}
