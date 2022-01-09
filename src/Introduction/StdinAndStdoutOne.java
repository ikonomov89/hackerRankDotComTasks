package Introduction;

import config.TaskRunning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StdinAndStdoutOne implements TaskRunning {

    public StdinAndStdoutOne() {
        this.description();
        this.work();
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "There are 3 lines of input, and each line contains a single integer.");
        System.out.println("Enter now:\n");

    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            values.add(Integer.parseInt(scanner.nextLine()));
        }

        for (Integer value : values) {
            System.out.println(value);
        }

    }
}
