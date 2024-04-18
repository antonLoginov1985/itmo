package itmo.lab5;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //lesson 1
        String inputString = "Написать метод для поиска самого длинного слова в тексте";
        String maxWord = returnMaxWord(inputString);
        System.out.println(maxWord);

        //lessons 2
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("Cлово: " + s + " Это полиндром - " + isPalindrome(s));

        //lessons 3
        String inputText3 = "Напишите метод, заменяющий бяка в тексте все вхождения слова «бяка»";
        System.out.println(replaceByka(inputText3));

        //lessons 4
        String text4 = "HRELJLLYUHKLLE";
        String subText4 = "LL";
        System.out.println(CountSplit(text4, subText4));

        //lessons 5
        String text5 = "Sample Output: \n The given string is: This is a test string \n The string reversed word by word is \n sihT si a tset gnirts \n";
        System.out.println(reversText(text5));
    }

    public static String returnMaxWord(String inputText) {
        String maxWord = "";
        String[] word = inputText.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= maxWord.length()) {
                maxWord = word[i];
            }
        }
        return maxWord;
    }

    public static boolean isPalindrome(String inputString) {
        String clearString = inputString.toLowerCase();
        System.out.println(clearString);
        StringBuffer sb = new StringBuffer(clearString).reverse();
        return sb.toString().equals(clearString.toString());
    }

    public static String replaceByka(String inputString) {

        return inputString.replaceAll("бяка+", "[вырезано цензурой]");
    }

    public static int CountSplit(String text4, String subText4) {
        int lastIndex = 0;
        int result = 0;
        while (lastIndex != -1) {
            lastIndex = text4.indexOf(subText4, lastIndex);

            if (lastIndex != -1) {
                result++;
                lastIndex += 1;
            }
        }
        return result;
    }

    public static String reversText(String inputText) {

        String clearText = inputText.replaceAll("[^\\sa-zA-Z0-9]", "");
        String newText = "";

        String[] word = clearText.split(" ");
        for (int i = 0; i < word.length; i++) {
            StringBuffer sb = new StringBuffer(word[i]).reverse();
            if (newText != "") {
                newText = newText + " " + sb.toString();
            } else {
                newText = newText + sb.toString();
            }

        }

        return newText;

    }
}
