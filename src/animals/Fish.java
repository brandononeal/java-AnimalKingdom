package animals;

public class Fish extends Animal {
  public Fish(String name, int yearDiscovered) {
    super(name, yearDiscovered);
  }

  @Override
  public String getMovement() {
    return "swim";
  }

  @Override
  public String getBreath() {
    return "gills";
  }

  @Override
  public String getReproduction() {
    return "eggs";
  }
}
