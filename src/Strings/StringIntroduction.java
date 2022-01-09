package Strings;

import config.TaskRunning;

import java.util.Scanner;

public class StringIntroduction implements TaskRunning {

    public StringIntroduction() {
        this.description();
        this.work();
    }

    @Override
    public void description() {
        System.out.println("Input Format\n" +
                "\n" +
                "The first line contains a string 'A'. The second line " +
                "contains another string 'B'. The strings are comprised" +
                " of only lowercase English letters." + "Output Format\n" +
                "\n" +
                "There are three lines of output:\n" +
                "For the first line, sum the lengths of 'A' and 'B'.\n" +
                "For the second line, write Yes if 'A' is lexicographically " +
                "greater than 'B' otherwise print " +
                "No instead.\n" +
                "For the third line, capitalize the first letter" +
                " in both 'A' and 'B' and print them on a single line," +
                " separated by a space.");
        System.out.println("Enter now:");
    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        int sumWordsLetter = A.length() + B.length();
        System.out.println(sumWordsLetter);

        String areWordsLexicographically = "Yes";

        if (A.compareTo(B) <= 0) {
            areWordsLexicographically = "No";
        }

        System.out.println(areWordsLexicographically);

        String modifyA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String modifyB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.printf("%s %s", modifyA, modifyB);

    }
}
