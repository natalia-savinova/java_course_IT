package hw1;

public class Book {

//    есть книга. в ней k строк на каждой странице. дано число n - номер строки от начала книги (от первой страницы).
//    надо посчитать на какой по счете строке страницы находится эта самая строка n

    public static void stringNumber(int k, int n) {
        int result = (n-1) % k + 1;
        System.out.println("Number of the string = " + result);
    }
}
