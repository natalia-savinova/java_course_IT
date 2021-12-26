package hw2;

public class PrimeNumber {

    //На вход в функцию подается положительное число N. Вывести все простые числа от 1 до N

    public static void main(String[] args) {
        primeNumbers(-3);
        line();
        primeNumbers(0);
        line();
        primeNumbers(1);
        line();
        primeNumbers(2);
        line();
        primeNumbers(3);
        line();
        primeNumbers(13);
        line();
        primeNumbers(18);
    }

    public static void primeNumbers(int number) {

        if(number <= 0) {
            System.out.println("Number must be greater than zero");
        }

        for(int i = 2; i <= number; i++) {
            Boolean flag = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.println(i);
            }
        }
    }

    public static void line() {
        System.out.println("---------------");
    }
}
