package stream;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
//        Filter the list of String containing “aj” and not containing white space.
        List<String> names = Arrays.asList("Sajan Shrestha","Samikshya", "Sajiya","Majakiya");

        names.stream().filter(s -> s.contains("aj") && !s.contains(" ")).forEach(y -> System.out.println(y));
    }
}
