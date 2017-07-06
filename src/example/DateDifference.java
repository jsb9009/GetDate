package example;
/**
 * Created by jaliya on 7/6/17.
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDifference {

    public String[] SplitDate(String input) {
        String dateParts1[] = input.split("-");
        String day  = dateParts1[0];
        String month  = dateParts1[1];
        String year = dateParts1[2];
        String[] dateString = new String[3];
        dateString[0] = day;
        dateString[1] = month;
        dateString[2] = year;
        return dateString;
    }

    public int[] ConvertDate(String dateString[]) {
        int[] dateInt = new int[3];
        dateInt[0] = Integer.parseInt(dateString[0]);
        dateInt[1] = Integer.parseInt(dateString[1]);
        dateInt[2] = Integer.parseInt(dateString[2]);
        return dateInt;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        DateDifference df = new DateDifference();

        System.out.print("Insert first date : ");
        String date1 = s.nextLine();
        System.out.print("Insert second date : ");
        String date2 = s.nextLine();

        String dateString1[] = df.SplitDate(date1);
        String dateString2[] = df.SplitDate(date2);

        int dateInt1[] = df.ConvertDate(dateString1);
        int dateInt2[] = df.ConvertDate(dateString2);

        LocalDate fromDay = LocalDate.of(dateInt1[2],dateInt1[1],dateInt1[0]);
        LocalDate toDay = LocalDate.of(dateInt2[2],dateInt2[1],dateInt2[0]);

        Period age = Period.between(fromDay, toDay);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        System.out.println("number of years: " + Math.abs(years));
        System.out.println("number of months: " + Math.abs(months));
        System.out.println("number of days: " + Math.abs(days));
    }

}
