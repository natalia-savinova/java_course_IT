package hw4.cars.com.company.vehicles;

import hw4.cars.com.company.professions.Driver;
import hw4.cars.com.company.vdetails.Engine;

public class Lorry extends Car{
    int carryingCapacity;

    public Lorry(String carBrand, String carClass, int carWeight, Driver driver, Engine engine, int carryingCapacity) {
        super(carBrand, carClass, carWeight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public String toString() {
        return super.toString() + "\nCarrying Capacity: " + getCarryingCapacity();
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}
