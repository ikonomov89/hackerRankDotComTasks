package Introduction;

import config.TaskRunning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutputFormatting implements TaskRunning {

    public OutputFormatting() {
        this.description();
        this.work();
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "Every line of input will contain a String followed by an integer.\n" +
                "Each String will have a maximum of 10 alphabetic characters, and each integer " +
                "will be in the inclusive range from 0 to 99.\n" +
                "Output Format\n" +
                "\n" +
                "In each line of output there should be two columns:\n" +
                "The first column contains " +
                "the String and is left justified using exactly 15 characters.\n" +
                "The second column contains the integer, expressed in exactly 3 digits;" +
                " if the original input has less than three digits," +
                " you must pad your output's leading digits with zeroes.\n");
        System.out.println("Enter now:\n");

    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
        List<String> text = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            StringBuilder sb = new StringBuilder(18);
            char[] arrWord = new char[15];
            char[] arrNumber = new char[3];

            String[] tokens = scanner.nextLine().split(" ");
            String word = tokens[0];
            String number = tokens[1];

            if (number.length() == 2) {
                arrNumber[0] = '0';
                arrNumber[1] = number.charAt(0);
                arrNumber[2] = number.charAt(1);

            } else if (number.length() == 1) {
                arrNumber[0] = '0';
                arrNumber[1] = '0';
                arrNumber[2] = number.charAt(0);
            } else {

                for (int j = 0; j < number.length(); j++) {
                    arrNumber[j] = number.charAt(j);
                }

            }

            for (int j = 0; j < word.length(); j++) {
                arrWord[j] = word.charAt(j);
            }

            for (int j = word.length(); j < arrWord.length; j++) {
                arrWord[j] = ' ';
            }

            sb.append(arrWord);
            sb.append(arrNumber);

            text.add(sb.toString());

        }

        System.out.println("================================");

        for (String s : text) {
            System.out.print(s);
            System.out.println();
        }

        System.out.println("================================");

    }
}
