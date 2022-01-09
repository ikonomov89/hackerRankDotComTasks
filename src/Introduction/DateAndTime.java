package Introduction;

import config.TaskRunning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndTime implements TaskRunning {

    public DateAndTime() {
        this.work();
    }

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void description() {
        System.out.println("Input Format\n" +
                "\n" +
                "A single line of input containing the space separated month, day and year, respectively, in MM/DD/YYYY format.\n" +
                "Return: String: the day of the week in capital letters\n");
        System.out.println("Enter now\n");

    }

    @Override
    public void work() {

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
        } catch (
                ParseException e) {
            System.out.println("Not valid date format");
        }
    }
}



