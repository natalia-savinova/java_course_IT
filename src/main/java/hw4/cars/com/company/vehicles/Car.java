package hw4.cars.com.company.vehicles;

import hw4.cars.com.company.professions.Driver;
import hw4.cars.com.company.vdetails.Engine;

public class Car {
    String carBrand;
    String carClass;
    int carWeight;
    Driver driver;
    Engine engine;

    public Car(String carBrand, String carClass, int carWeight, Driver driver, Engine engine) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.carWeight = carWeight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        return "Car Brand: " + getCarBrand() + "\nCar Class: " + getCarClass() + "\nCar Weight: " + getCarWeight() +
                "\nDRIVER: " + driver.toString() + "\nENGINE: " + engine.toString();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }
}
