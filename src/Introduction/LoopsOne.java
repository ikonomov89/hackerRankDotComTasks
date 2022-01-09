package Introduction;

import config.TaskRunning;

import java.util.Scanner;

public class LoopsOne implements TaskRunning {

    public LoopsOne() {
        this.description();
        this.work();
    }


    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "A single integer,'N'.\n" +
                "Output Format\n" +
                "\n" +
                "Print '10' lines of output; each line 'i' (where 1<= i <= 10 ) " +
                "contains the result of 'N'x'i' in the form:\n" +
                "N x i = result.");
        System.out.println("Enter now:\n");
    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d %n", n, i, Math.multiplyExact(n, i));
        }

    }
}
