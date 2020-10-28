package animals;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Animal> animalList = new ArrayList<>();

    animalList.add(new Mammal("Panda", 1869));
    animalList.add(new Mammal("Zebra", 1778));
    animalList.add(new Mammal("Koala", 1816));
    animalList.add(new Mammal("Sloth", 1804));
    animalList.add(new Mammal("Armadillo", 1758));
    animalList.add(new Mammal("Raccoon", 1758));
    animalList.add(new Mammal("Bigfoot", 2021));

    animalList.add(new Bird("Pigeon", 1837));
    animalList.add(new Bird("Peacock", 1821));
    animalList.add(new Bird("Toucan", 1758));
    animalList.add(new Bird("Parrot", 1824));
    animalList.add(new Bird("Swan", 1758));

    animalList.add(new Fish("Salmon", 1758));
    animalList.add(new Fish("Catfish", 1817));
    animalList.add(new Fish("Perch", 1758));

    System.out.print("*** List all the animals in descending order by year named ***\n");
    System.out.print("[");
    animalList.sort((a1, a2) -> (a1.getYearDiscovered() < a2.getYearDiscovered()) ? 1 : -1);
    animalList.forEach(a -> System.out.print(a));
    System.out.print("]");
    System.out.println("\n");

    System.out.print("*** List all the animals alphabetically ***\n");
    System.out.print("[");
    animalList.sort((a1, a2) -> (a1.getName().compareToIgnoreCase(a2.getName())));
    animalList.forEach(a -> System.out.print(a));
    System.out.print("]");
    System.out.println("\n");

    System.out.print("*** List all the animals order by how they move ***\n");
    System.out.print("[");
    animalList.sort((a1, a2) -> (a1.getMovement().compareToIgnoreCase(a2.getMovement())));
    animalList.forEach(a -> System.out.print(a));
    System.out.print("]");
    System.out.println("\n");

    System.out.print("*** List only those animals that breath with lungs ***\n");
    printFilteredList(animalList, a -> a.getBreath() == "lungs" );
    System.out.println();

    System.out.print("*** List only those animals that breath with lungs and were named in 1758 ***\n");
    printFilteredList(animalList, a -> a.getBreath() == "lungs" && a.getYearDiscovered() == 1758);
    System.out.println();

    System.out.print("*** List only those animals that lay eggs and breath with lungs ***\n");
    printFilteredList(animalList, a -> a.getReproduction() == "eggs" && a.getBreath() == "lungs");
    System.out.println();

    System.out.print("*** List alphabetically only those animals that were named in 1758 ***\n");
    animalList.sort((a1, a2) -> (a1.getName().compareToIgnoreCase(a2.getName())));
    printFilteredList(animalList, a -> a.getYearDiscovered() == 1758);
    System.out.println();

    System.out.print("*** For the list of animals, list alphabetically those animals that are mammals ***\n");
    printFilteredList(animalList, a -> a instanceof Mammal);
  }
  public static void printFilteredList(List <Animal> animalList, AnimalTester animalTester) {
    for (Animal a : animalList) {
      if (animalTester.test(a)) {
        System.out.print(a.getName() + " " + a.getReproduction() + " " + a.getMovement() + " " + a.getBreath() + " " + a.getYearDiscovered()+ "\n");
      }
    }
  }
}
