package hw2;

public class Space {

//    На вход в функцию подается строка. Посчитать количество пробелов в этой строке

    public static void main(String[] args) {
        System.out.println(numberOfSpaces("Hello, Kitty!"));//1
        PrimeNumber.line();
        System.out.println(numberOfSpaces("He ll o, Ki tty !"));//5
        PrimeNumber.line();
        System.out.println(numberOfSpaces("Hello ,  Kitty!"));//3
        PrimeNumber.line();
        System.out.println(numberOfSpaces(" "));//1
        PrimeNumber.line();
        System.out.println(numberOfSpaces("  "));//2
    }

    public static int numberOfSpaces(String text) {
        int result = 0;
        String[] array = text.split("");

        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(" ")) {
                result++;
            }
        }

        return result;
    }
}
