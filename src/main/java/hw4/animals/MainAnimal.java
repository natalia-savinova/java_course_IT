package hw4.animals;

public class MainAnimal {
    public static void main(String[] args) {
        Cat princessCarolyn = new Cat("Princess Carolyn","Office", "Sandwiches");
        Dog mrPeanutbutter = new Dog("Mr. Peanutbutter", "Filming location", "Donuts");
        Horse boJack = new Horse("BoJack","Living room", "Whiskey");

        princessCarolyn.makeNoise();
        mrPeanutbutter.makeNoise();
        boJack.makeNoise();

        Vet.treatAnimal(princessCarolyn);
        Vet.treatAnimal(mrPeanutbutter);
        Vet.treatAnimal(boJack);

        Animal[] animals = new Animal[] {princessCarolyn, mrPeanutbutter, boJack};

        for(Animal item : animals) {
            System.out.println(item.getName() + " goes to the psychotherapist");
        }
    }
}
