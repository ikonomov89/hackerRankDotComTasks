package Tasks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Introduction {

    private static Scanner scanner = new Scanner(System.in);

//    private static int B = 0;
//    private static int H = 0;
//    private static boolean flag = stateOfFlag();

//    private static boolean stateOfFlag() {
//
//        B = scanner.nextInt();
//        H = scanner.nextInt();
//
//        if (H <= 0 || B <= 0) {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//            return false;
//        }
//
//        return true;
//    }

    public static void main(String[] args) {

//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
//        Task6();
//        Task7();
//        Task8();
//        Task9();
//        Task10();
        Task11();


    }

    private static void Task11() {


    }


    //Java Date and Time
    private static void Task10() {
        String[] input = scanner.nextLine().split(" ");

        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);
        int year = Integer.parseInt(input[2]);

        String date = String.format("%d/%d/%d", month, day, year);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("M/D/YYYY");
        Date myDate;


        try {
            myDate = format.parse(date);
            c.setTime(myDate);
            String dayOfTheWeek = new SimpleDateFormat("EEEE").format(c.get(Calendar.DAY_OF_WEEK));
            System.out.println(dayOfTheWeek);
        } catch (ParseException e) {
            System.out.println("Not valid date format");
        }


    }

    //Java Static Blocks
    private static void Task9() {

//        if (flag) {
//            int area = B * H;
//            System.out.println(area);
//        }


    }

    //Java End-Of-file
    private static void Task8() {

        List<String> text = new ArrayList<>();

        while (scanner.hasNext()) {

            String input = scanner.nextLine();

            if (input.contains("end-of-file")) {
                text.add(input);
                break;
            }

            text.add(input);

        }

        for (int i = 0; i < text.size(); i++) {
            System.out.printf("%d %s%n", (i + 1), text.get(i));
        }


    }

    //Java DataTypes
    private static void Task7() {

        List<String> result = new ArrayList<>();
        int q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < q; i++) {

            try {

                long n = scanner.nextLong();    //Задача го изисква
                result.add(n + " can be fitted in:");
                if (n >= -128 && n <= 127) {
                    result.add("* byte");
                }
                if (n >= -32768 && n <= 32767) {
                    result.add("* short");
                }
                if (n >= -2147483648 && n <= 2147483647) {

                    result.add("* int");
                }

                result.add("* long");


            } catch (Exception e) {
                result.add(scanner.next() + " can't be fitted anywhere. ");
            }


        }

        for (String s : result) {
            System.out.println(s);
        }


    }

    //Java Loops II
    private static void Task6() {

        List<String> printResult = new ArrayList<>();

        int q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < q; i++) {
            StringBuilder sb = new StringBuilder();
            String[] args = scanner.nextLine().split(" ");
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int n = Integer.parseInt(args[2]);

            int[] totalSum = new int[n];

            int sum0 = (int) (a + Math.pow(2, 0) * b);

            totalSum[0] = sum0;

            for (int j = 1; j < n; j++) {

                int sum = (int) (totalSum[j - 1] + Math.pow(2, j) * b);
                totalSum[j] = sum;

            }

            for (int i1 : totalSum) {
                sb.append(i1).append(" ");
            }

            printResult.add(sb.toString());

        }

        for (String s : printResult) {
            System.out.println(s);
        }


    }

    //Java Loops I
    private static void Task5() {

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d %n", n, i, Math.multiplyExact(n, i));
        }

    }

    //Java Output Formatting
    private static void Task4() {

        ArrayList<String> text = new ArrayList<>();


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

    //Java Stdin and Stdout II
    private static void Task3() {
        String s = "";
        double d = 0.0;
        int i = 0;

        for (int k = 0; k < 3; k++) {
            if (k == 0) {
                i = Integer.parseInt(scanner.nextLine());
            } else if (k == 1) {
                d = Double.parseDouble(scanner.nextLine());
            } else {
                s = scanner.nextLine();
            }
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    //Java If-Else
    private static void Task2() {

        int n = Integer.parseInt(scanner.nextLine());

        if (n % 2 == 1) {
            System.out.println("Weird");

        } else if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            System.out.println("Not Weird");

        } else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            System.out.println("Weird");

        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");

        } else {
            System.out.println("Weird");
        }


    }

    //Java Stdin and Stdout I
    private static void Task1() {

        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            values.add(Integer.parseInt(scanner.nextLine()));
        }

        for (Integer value : values) {
            System.out.println(value);
        }


    }

}
