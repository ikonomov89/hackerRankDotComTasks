package Introduction;


import config.TaskRunning;

import java.util.Scanner;

public class StaticBlocks implements TaskRunning {

    public StaticBlocks() {
        this.description();
        this.work();
    }

    private static Scanner scanner = new Scanner(System.in);
    private static int B = 0;
    private static int H = 0;
    private static boolean flag = stateOfFlag();

    private static boolean stateOfFlag() {

        B = scanner.nextInt();
        H = scanner.nextInt();

        if (H <= 0 || B <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }

        return true;
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "There are two lines of input. The first line contains B:" +
                " the breadth of the parallelogram. The next line contains H: " +
                "the height of the parallelogram.\n" + "Output Format\n" +
                "\n" +
                "If both values are greater than zero, then the main method must" +
                " output the area of the parallelogram. " +
                "Otherwise, print \"java.lang.Exception: " +
                "Breadth and height must be positive\" without quotes.\n");
        System.out.println("Enter now:\n");

    }

    @Override
    public void work() {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }


}
