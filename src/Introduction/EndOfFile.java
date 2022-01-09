package Introduction;

import config.TaskRunning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFile implements TaskRunning {

    public EndOfFile() {
        this.description();
        this.work();
    }

    private Scanner scanner = new Scanner(System.in);

    private List<String> text = new ArrayList<>();

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.\n" +
                "\n" +
                "Output Format\n" +
                "\n" +
                "For each line, print the line number, followed by a single space, and then the line content received as input.");
        System.out.println("Enter now:\n");

    }

    @Override
    public void work() {

        while (scanner.hasNext()) {

            String input = scanner.nextLine();

            if (input.contains("end-of-file")) {
                text.add(input);
                break;
            }

            text.add(input);

        }

        for (
                int i = 0; i < text.size(); i++) {
            System.out.printf("%d %s%n", (i + 1), text.get(i));
        }
    }


}
