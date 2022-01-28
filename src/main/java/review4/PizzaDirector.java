package review4;

public class PizzaDirector {
    public static Pizza getMargarita(int diameter) {
        return new PizzaBuilder()
                .setSous("Tomato")
                .setTomato("Red tomatoes")
                .setCheese("Mozzarella")
                .setDiameter(diameter)
                .build();

    }

    public static Pizza getHawaiian(int diameter) {
        return new PizzaBuilder()
                .setSous("Cream")
                .setTomato("Cherry tomatoes")
                .setCheese("Mozzarella")
                .setDiameter(diameter)
                .setPineapple(true)
                .build();

    }
}
