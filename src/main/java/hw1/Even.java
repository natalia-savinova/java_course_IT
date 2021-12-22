package hw1;

import java.util.Scanner;

public class Even {

//    Написать функцию, которая принимает на вход целое число и выводит на экран является ли оно четным

    public static void isEven() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = in.nextInt();
        in.close();

        if(a == 0) {
            System.out.println("Enter a number other than zero");
        }

        if (a % 2 == 0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
