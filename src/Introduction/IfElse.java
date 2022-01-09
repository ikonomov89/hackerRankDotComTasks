package Introduction;

import config.TaskRunning;

import java.util.Scanner;

public class IfElse implements TaskRunning {

    public IfElse() {
        this.description();
        this.work();
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "A single line containing a positive integer,'n' .\n" +
                "Output Format\n" +
                "\n" +
                "Print Weird if the number is weird; otherwise, print Not Weird.\n");
        System.out.println("Enter now:\n");

    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
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
}
