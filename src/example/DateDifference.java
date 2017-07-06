
package example;

/**
 * Created by jaliya on 7/6/17.
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * implemented to get the difference of particular two dates which are entered in DD/MM/YYYY format
 */
public class DateDifference {

    /**
     * method is used to divide the user input date string into separate strings according to day,month and year
     * @param input the date string which was entered by the user
     * @return the date which has been divided into separate day,month and year strings as an string array
     */
    private String[] splitDate(String input) {
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

    /**
     * convert the separated input date Strings into int type dates
     * @param dateString separated date strings as an array
     * @return separated int type dates as an array
     */
    private int[] convertDate(String dateString[]) {
        int[] dateInt = new int[3];
        dateInt[0] = Integer.parseInt(dateString[0]);
        dateInt[1] = Integer.parseInt(dateString[1]);
        dateInt[2] = Integer.parseInt(dateString[2]);

        return dateInt;
    }


    private void printValues(int years,int months,int days) {

        int a = Math.abs(years);
        int b = Math.abs(months);
        int c = Math.abs(days);

        System.out.println("number of years: " + a);
        System.out.println("number of months: " + b);
        System.out.println("number of days: " + c);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        DateDifference df = new DateDifference();

        System.out.print("Insert first date : ");
        String fromDate = s.nextLine();

        System.out.print("Insert second date : ");
        String toDate = s.nextLine();

        String dateString1[] = df.splitDate(fromDate);
        String dateString2[] = df.splitDate(toDate);

        int dateInt1[] = df.convertDate(dateString1);
        int dateInt2[] = df.convertDate(dateString2);

        LocalDate fromDay = LocalDate.of(dateInt1[2],dateInt1[1],dateInt1[0]);
        LocalDate toDay = LocalDate.of(dateInt2[2],dateInt2[1],dateInt2[0]);

        Period age = Period.between(fromDay, toDay);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();

        df.printValues(years,months,days);

    }
}
