package hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {
//    На вход в функцию подается целое число и лист листов.
//    Вернуть true, если в листе содержится столько элементов, сколько цифр в числе и каждый элемент листа
//    содержит количество элементов равное цифре соответствующей цифре числа. Сами значения внутри листа
//    роли не играют, важно количество.
//    Например: число 35 и лист: { 0 ⇒ {1, 2, 3}, 1 ⇒ {1, 2, 3, 4, 5}} ⇒ true
//    число 2 и лист: { 0 ⇒ {1, 2, 3}} ⇒ false

    public static void main(String[] args) {

        List<List<Integer>> list1 = new ArrayList<>();
        list1.add(Arrays.asList (1, 2, 3));
        list1.add(Arrays.asList(1, 2, 3, 4, 5));

        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(Arrays.asList (1, 2, 3));

        Boolean result1 = isTrue(list1, 35);
        System.out.println(result1);

        Boolean result2 = isTrue(list2, 2);
        System.out.println(result2);
    }

    public static Boolean isTrue(List<List<Integer>> list, int number) {

        String numberToString = String.valueOf(number);
        int lengthOfNumber = numberToString.length();
        int[] arrNumber = new int[lengthOfNumber];
        for(int i = lengthOfNumber - 1; i >= 0; i--) {
            arrNumber[i] = number % 10;
            number = number / 10;
        }

        if(lengthOfNumber != list.size()) {
            return false;
        }

        for(int i = 0; i < arrNumber.length; i++) {
            if(list.get(i).size() != arrNumber[i]) {
                return false;
            }
        }

        return true;
    }
}
