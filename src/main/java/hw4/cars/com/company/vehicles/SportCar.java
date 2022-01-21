package hw4.cars.com.company.vehicles;

import hw4.cars.com.company.professions.Driver;
import hw4.cars.com.company.vdetails.Engine;

public class SportCar extends Car{
    double maxSpeed;

    public SportCar(String carBrand, String carClass, int carWeight, Driver driver, Engine engine, double maxSpeed) {
        super(carBrand, carClass, carWeight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return super.toString() + "\nMax Speed: " + getMaxSpeed();
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
