package hw4.animals;

public class Dog extends Animal{
    private String noise = "barks";

    public Dog(String name, String location, String food) {
        super(name, location, food);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " " + getNoise() + " loudly in the " + getLocation());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " prefer ti eat " + getFood());
    }

    public String getNoise() {
        return noise;
    }
}
