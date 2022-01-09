package Introduction;

import config.TaskRunning;

import java.util.Scanner;

public class StdinAndStdoutTwo implements TaskRunning {

    public StdinAndStdoutTwo() {
        this.description();
        this.work();
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "There are three lines of input:\n" +
                "\n" +
                "The first line contains an integer.\n" +
                "The second line contains a double.\n" +
                "The third line contains a String.\n" +
                "Output Format\n" +
                "\n" +
                "There are three lines of output:\n" +
                "\n" +
                "On the first line, print String: followed by the unaltered String read from stdin.\n" +
                "On the second line, print Double: followed by the unaltered double read from stdin.\n" +
                "On the third line, print Int: followed by the unaltered integer read from stdin.\n");
        System.out.println("Enter now:\n");

    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
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

}
