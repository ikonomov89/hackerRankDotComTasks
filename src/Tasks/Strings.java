package Tasks;

import java.util.Scanner;

public class Strings {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Task1();

    }


    //Java String Introduction
    private static void Task1() {

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
