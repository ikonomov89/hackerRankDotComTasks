package Introduction;

import config.TaskRunning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataTypes implements TaskRunning {

    public DataTypes() {
        this.description();
        this.work();
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "The first line contains an integer,T, denoting the number of test cases.\n" +
                "Each test case,T, is comprised of a single line with an integer,n, which can be arbitrarily large or small.\n" +
                "Output Format\n" +
                "\n" +
                "For each input variable n and appropriate primitive dateType, you must determine " +
                "if the given primitives are capable of storing it.\n");
        System.out.println("Enter now:\n");

    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        int q = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < q; i++) {

            try {

                long n = scanner.nextLong();
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
}
