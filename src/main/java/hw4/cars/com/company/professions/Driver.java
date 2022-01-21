package hw4.cars.com.company.professions;

public class Driver extends Person{
    int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDriving Experience: " + getDrivingExperience();
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }
}
