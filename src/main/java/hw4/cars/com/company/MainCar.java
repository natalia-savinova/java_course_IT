package hw4.cars.com.company;

import hw2.PrimeNumber;
import hw4.cars.com.company.professions.Driver;
import hw4.cars.com.company.vdetails.Engine;
import hw4.cars.com.company.vehicles.Car;
import hw4.cars.com.company.vehicles.Lorry;
import hw4.cars.com.company.vehicles.SportCar;

public class MainCar {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Harry Kersh ", 36, 10);
        Driver driver2 = new Driver("Joe Avella", 41, 18);
        Engine engine1 = new Engine(2720, "DDC/MTU");
        Engine engine2 = new Engine(640, "Chrysler");
        Lorry lorry1 = new Lorry("Liebherr", "Ultra class", 261, driver1, engine1, 120);
        Car car1 = new Car("Liebherr1", "Ultra class1", 262, driver1, engine1);
        SportCar sportCar1 = new SportCar("Dodge Viper", "Sports car (S)", 230, driver2,engine2,492);

        System.out.println(lorry1.toString());
        PrimeNumber.line();
        System.out.println(car1.toString());
        PrimeNumber.line();
        System.out.println(sportCar1.toString());
    }
}
