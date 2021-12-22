package review1;

public class FizzBuzz {

//    1. review1.FizzBuzz
//    Написать функцию, которая выводит на экран Fizz если число делится на 3
//    и Buzz, если число делится на 5.
//    Если число делитcя а 15, то в консоль выводится review1.FizzBuzz

    public static void fizzBuzzResult(int num) {

        if(num % 15 == 0) {
            System.out.println("review1.FizzBuzz");
        }else if(num % 5 == 0) {
            System.out.println("Buzz");
        }else if(num % 3 == 0) {
            System.out.println("Fizz");
        }else {
            System.out.println(num);
        }
    }

}
