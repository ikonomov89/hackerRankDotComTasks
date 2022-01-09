package Introduction;

import config.TaskRunning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopsTwo implements TaskRunning {

    public LoopsTwo() {
        this.description();
        this.work();
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "The first line contains an integer,'q', denoting the number of queries.\n" +
                "Each line 'i' of the 'i' subsequent lines contains " +
                "three space-separated integers describing the respective 'a','b' , and 'i' values for that query.\n" +
                "Output Format\n" +
                "\n" +
                "For each query, print the corresponding " +
                "series on a new line. Each series must be printed in " +
                "order as a single line of 'n' space-separated integers.\n");

        System.out.println("Enter now:\n");
    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);

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
}
