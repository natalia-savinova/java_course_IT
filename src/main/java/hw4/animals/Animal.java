package hw4.animals;

public abstract class Animal {
    private String name;
    private String location;
    private String food;

    public Animal(String name, String location, String food) {
        this.name = name;
        this.location = location;
        this.food = food;
    }

    public void makeNoise() {
        System.out.println(getName() + " спит.");
    }

    public void eat() {
        System.out.println(getName() + " ест");
    }

    public void sleep() {
        System.out.println(getName() + " спит");
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getFood() {
        return food;
    }
}
