package example;

//Respond to the IDE notifications on demand. eg: remove unused imports etc.

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by jaliya on 7/5/17.
 */

// Use meaningful names as class names
public class Test {

    // Avoid writing logics in main()
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Insert first date : ");

        //Variable names should be meaningful
        String a = s.nextLine();
        System.out.print("Insert second date : ");
        String b = s.nextLine();

            /* DateTimeFormatter formatter = DateTimeFormatter.forPattern("dd/MM/yyyy").withLocale(Locale.UK);


            LocalDate date = formatter.parseLocalDate(b);

            System.out.println(date.getYear());
            System.out.println(date.getMonthOfYear());
            System.out.println(date.getDayOfMonth());

                                                       */
    //Break the each functionality to methods when possible

        String dateParts1[] = a.split("-");
        String day1  = dateParts1[0];
        String month1  = dateParts1[1];
        String year1 = dateParts1[2];

        String dateParts2[] = b.split("-");
        String day2  = dateParts2[0];
        String month2  = dateParts2[1];
        String year2 = dateParts2[2];


        int result1 = Integer.parseInt(day1);
        int result2 = Integer.parseInt(month1);
        int result3 = Integer.parseInt(year1);

        int result4 = Integer.parseInt(day2);
        int result5 = Integer.parseInt(month2);
        int result6 = Integer.parseInt(year2);

        LocalDate fromDay = LocalDate.of(result3,result2,result1);
        LocalDate toDay = LocalDate.of(result6,result5,result4);

        Period age = Period.between(fromDay,toDay);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();


        System.out.println("number of years: " + years);
        System.out.println("number of months: " + months);
        System.out.println("number of months: " + days);
    }

}
