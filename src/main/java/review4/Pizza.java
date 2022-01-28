package review4;

import java.util.HashMap;

public class Pizza {

//    Написать класс пицца-мейкера. Клиент приходит в ресторан и заказывает пиццу
//    определенного типа. На экран выводится пошаговый рецепт ее приготовления, например:
//    1. Взять основу 30 см
//    2. Намазать томатный соус
//    3. Уложить помидоры
//    4. Посыпать сыром
//    5. Выпекать в духовке 15 минут при температуре 220 градусов
//    Реализовать билдер, чтобы клиент имел возможность собрать “кастомную” пиццу
//    самостоятельно.
//    Предусмотреть возможность добавлять доп. ингридиенты в существующие стандартные пиццы

    private int diameter;
    HashMap<String, Integer> ingredients = new HashMap<>();

    public void printRecipe() {
        int counter = 1;
        System.out.println(counter + ". Take a pizza base " + diameter + " cm");

        for (String key : ingredients.keySet()) {
            if(ingredients.get(key) == 1) {
                counter++;
                System.out.println(counter + ". Add " + key + " sous");
            }
        }

        for (String key : ingredients.keySet()) {
            if(ingredients.get(key) == 2) {
                counter++;
                System.out.println(counter + ". Add " + key);

            }
        }

        counter++;

        System.out.println(counter + ". Bake in the oven for 15 minutes at 220 degrees");

    }

    public void addIngredient(String name, int priority) {
        ingredients.put(name, priority);
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
