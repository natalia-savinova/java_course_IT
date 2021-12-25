package hw2;

public class Word {
    //Взять задачу 1. Поменять условие таким образом, чтобы считалось количество слов

    public static void main(String[] args) {
        System.out.println(numberOfWords("Hello, Kitty!"));
        System.out.println(numberOfWords("Hello,  Kitty!"));
        System.out.println(numberOfWords("Hello , Kitty!"));
        System.out.println(numberOfWords("Hello,,, Kitty !"));
    }

    public static int numberOfWords(String text) {

        String[] symbolsToReplace = new String[] {".", ",", ":", ";", "!", "?"};
        String newText = text;

        for(String index : symbolsToReplace) {
            newText = newText.replace(index, " ");
        }

        String[] array = newText.split(" ");

        int count = 0;

        for(String item : array) {
            if(item.length() > 0) {
                count++;
            }
        }

        return count;
    }
}
