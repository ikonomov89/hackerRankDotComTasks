package Strings;

import config.TaskRunning;

import java.util.Scanner;

public class Substring implements TaskRunning {

    public Substring() {
        this.description();
        this.work();
    }

    @Override
    public void description() {

        System.out.println("Input Format\n" +
                "\n" +
                "The first line contains a single string denoting 's'.\n" +
                "The second line contains two space-separated integers denoting the respective values of 'start' and 'end'.\n" +
                "Output Format\n" +
                "\n" +
                "Print the substring in the inclusive range from 'start' to 'end-1'.");
        System.out.println("Enter now:");

    }

    @Override
    public void work() {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] tokens = scanner.nextLine().split(" ");
        int start = Integer.parseInt(tokens[0]);
        int end = Integer.parseInt(tokens[1]);
        String result = text.substring(start, end);
        System.out.println(result);


    }
}
