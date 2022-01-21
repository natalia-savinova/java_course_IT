package hw4.animals;

public class Cat extends Animal{
    private String noise = "meows";

    public Cat(String name, String location, String food) {
        super(name, location, food);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + " " + getNoise() + " in the " + getLocation());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " love to eat " + getFood());
    }

    public String getNoise() {
        return noise;
    }
}
