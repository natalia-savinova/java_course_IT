package hw2;

public class ArraysSum {
//    На вход в функцию подается массив и число N. Вернуть true, если в массиве есть любые 2 числа,
//    сумма которых дает N.
//    В противном случае вернуть false [1, 2, 3], 5 ⇒ true
//    [1, 2, 3], 4 ⇒ false

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};

        System.out.println(sumOfTwoNumbers(array, 5));//true
        System.out.println(sumOfTwoNumbers(array, 6));//false
        System.out.println(sumOfTwoNumbers(array, 0));//false
    }

    public static Boolean sumOfTwoNumbers(int[] array, int N) {

        Boolean result = false;

        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length - 1; j++) {
                if(array[i] + array[j] == N) {
                    result = true;
                }
            }
        }

        return result;
    }
}
