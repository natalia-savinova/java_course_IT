package review4;

public class PizzaBuilder {
    public Pizza pizza = new Pizza();

    public PizzaBuilder setDiameter(int diameter) {
        pizza.setDiameter(diameter);
        return this;
    }

    public PizzaBuilder setSous(String sous) {
        pizza.addIngredient(sous, 1);
        return this;
    }

    public PizzaBuilder setCheese(String cheese) {
        pizza.addIngredient(cheese, 2);
        return this;
    }

    public PizzaBuilder setTomato(String tomato) {
        pizza.addIngredient(tomato, 2);
        return this;
    }

    public PizzaBuilder setMushroom(String mushroom) {
        pizza.addIngredient(mushroom, 2);
        return this;
    }

    public PizzaBuilder setPineapple(boolean pineapple) {
        pizza.addIngredient("Pineapple", 2);
        return this;
    }

    public PizzaBuilder setSausage(String sausage) {
        pizza.addIngredient(sausage, 2);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
