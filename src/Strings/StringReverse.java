package Strings;

import config.TaskRunning;

import java.util.Scanner;

public class StringReverse implements TaskRunning {

    public StringReverse() {
        this.description();
        this.work();
    }


    @Override
    public void description() {

        System.out.println("A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.\n" +
                "\n" +
                "Given a string , print Yes if it is a palindrome, print No otherwise.\n");
        System.out.println("Enter now:");
    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String reverse = "";
        String result = "Yes";
        StringBuilder sb = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }

        reverse = sb.toString();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != reverse.charAt(i)) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }
}
