import java.util.Scanner;

public class Division {

    //Написать программу, которая записывает в переменную с результат деления переменной а на b. а и b вводятся с клавиатуры

    public static void divisionResult() {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number a: ");
        int a = in.nextInt();
        System.out.print("Input a number b: ");
        int b = in.nextInt();
        in.close();

        if(b == 0) {
            System.out.println("Number b must not be zero");
        }else {
            double c = 1.0 * a / b;
            System.out.println("Quotient of division = " + c);
        }
    }
}
