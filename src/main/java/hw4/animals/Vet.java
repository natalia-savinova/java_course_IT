package hw4.animals;

public class Vet {
    public static void treatAnimal(Animal animal) {
        System.out.println(
                animal.getName() + "'s favorite food is " + animal.getFood() + ". Location is " + animal.getLocation());
    }
}
