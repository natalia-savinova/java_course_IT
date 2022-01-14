package hw3;

// Создайте класс Phone, который содержит переменные number, model и weight.
// Создайте три экземпляра этого класса.
// Выведите на консоль значения всех переменных каждого объекта.
// Добавьте в класс Phone методы: receiveCall, который имеет один параметр – имя звонящего и который выводит на консоль
// сообщение “Звонит {name}”, // getNumber – возвращает номер телефона.
// Вызвать эти методы для каждого из объектов.
// Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса -
// number, model и weight.
// Добавить конструктор, который принимает на вход два параметра для инициализации
// переменных класса - number, model.
// Добавить конструктор без параметров.
// Вызвать из конструктора с тремя параметрами конструктор с двумя.
// Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
// Создать метод sendMessage с аргументами переменной длины.
// Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
// Метод выводит на консоль номера этих телефонов.

import java.util.Scanner;

public class Phone {

    long number;
    String model;
    int weight;

    public Phone() {
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " Calls");
    }

    public void receiveCall(String name, long phoneNumber) {
        System.out.println(name + " Calls" + " The phone number is: " + phoneNumber);
    }

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public static void sendMessage() {

        StringBuilder numberOfPhones = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone numbers for sending a message, separate by Enter. \n" +
                "When done enter zero (0)... ");

        String input;
        input = scanner.nextLine();

        do{
            numberOfPhones.append(input);
            numberOfPhones.append(", ");
            input = scanner.nextLine();
        } while(!input.equals("0"));

        scanner.close();

        System.out.println(numberOfPhones);
    }
}
