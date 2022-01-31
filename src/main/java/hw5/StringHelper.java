package hw5;

import java.util.Locale;

public class StringHelper {
    String text;

    public StringHelper(String text) {
        this.text = text;
    }

    public int getWordCount() {
        String text = getText();
        String[] symbolsToReplace = new String[] {".", ",", ":", ";", "!", "?"};
        String newText = text;

        for(String index : symbolsToReplace) {
            newText = newText.replace(index, " ");
        }

        String deleteDigits = newText.replaceAll("[0-9]","");

        String[] array = deleteDigits.split(" ");

        int count = 0;

        for(String item : array) {
            if(item.length() > 0) {
                count++;
            }
        }
        return count;
    }

    public String cut() {
        String text = getText();
        StringBuilder result = new StringBuilder();

        String[] array = text.split(" ");
        int count = 0;

        if(text.length() < 100) {
            throw new RuntimeException("The string is too short");
        }

        for(int i = 0; i < array.length; i++) {
            if(array[i].length() < 98 - count) {
                count += array[i].length();
                result.append(array[i]);
                result.append(" ");
                count++;
            }else {
                result.setLength(result.length() - 1);
                result.append("...");
                break;
            }
        }
        return result.toString();
    }

    public String find(int index, String str) {
        String text = getText();
        String textToLowercase = text.toLowerCase(Locale.ROOT);
        String substring = textToLowercase.substring(index);

        if(substring.contains(str.toLowerCase(Locale.ROOT))) {
            return text.substring(textToLowercase.indexOf(str));
        }else {
            return text;
        }
    }

    public String getFirstNumber(){
        String text = getText();
        String[] symbolsToReplace = new String[] {".", ",", ":", ";", "!", "?"};
        String newText = text;

        for(String index : symbolsToReplace) {
            newText = newText.replace(index, " ");
        }

        String onlyDigits = newText.replaceAll("[^0-9\\s.]","/");
        String[] array = onlyDigits.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < array.length; i++) {
            if(array[i].length() > 0 && !array[i].contains("/")) {
                result.append(array[i]);
                break;
            }
        }

        if(result.length() > 0) {
            return result.toString();
        }else {
            throw new RuntimeException("There is no numbers in the string");
        }
    }

    public String getText() {
        return text;
    }
}
