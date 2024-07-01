package LocalDateAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chronounits {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate twoyears = date.plus(2, ChronoUnit.YEARS);
        System.out.println("Today after two years: "+twoyears);

        LocalDate threemths = date.plus(3, ChronoUnit.MONTHS);
        System.out.println("After three months: "+threemths);

        ChronoUnit chronounit = ChronoUnit.valueOf("FOREVER");
        System.out.println(chronounit);
    }
}
