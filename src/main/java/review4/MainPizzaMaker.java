package review4;

public class MainPizzaMaker {
    public static void main(String[] args) {
        Pizza pizza = PizzaDirector.getMargarita(30);
        Pizza pizza1 = PizzaDirector.getHawaiian(45);

        Pizza custom = new PizzaBuilder()
                .setTomato("Red tomato")
                .setCheese("Parmesan")
                .setDiameter(50)
                .build();

        pizza.printRecipe();
        pizza1.printRecipe();
        custom.printRecipe();
    }

}
