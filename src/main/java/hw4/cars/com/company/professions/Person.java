package hw4.cars.com.company.professions;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String toString() {
        return ("Age: " + getAge() + " FIO: " + getFullName());
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }
}
