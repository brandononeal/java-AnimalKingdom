package animals;

abstract class Animal {
  protected static int maxId = -1;
  protected int id;
  protected String name;
  protected int yearDiscovered;

  public Animal(String name, int yearDiscovered) {
    maxId++;
    id = maxId;
    this.name = name;
    this.yearDiscovered = yearDiscovered;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getYearDiscovered() {
    return yearDiscovered;
  }
  
  public String getEats() {
    return "eat";
  }

  abstract String getMovement();
  abstract String getBreath();
  abstract String getReproduction();

  @Override
  public String toString() {
    return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + yearDiscovered + "}\n";
  }
}
