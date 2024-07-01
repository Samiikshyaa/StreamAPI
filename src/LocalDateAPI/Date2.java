package LocalDateAPI;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;

public class Date2 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        int year = today.getYear();
        Month month = today.getMonth();
        int date = today.getDayOfMonth();
        DayOfWeek day = today.getDayOfWeek();
        int hour = today.getHour();
        int minute = today.getMinute();
        System.out.println("Year      : "+ year);
        System.out.println("Month     : "+month);
        System.out.println("Date      : "+date);
        System.out.println("Day       : "+day);
        System.out.println("Hour      : "+hour);
        System.out.println("Minute    : "+minute);

    }
}
