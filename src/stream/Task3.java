package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
//        Filter the list of String starting with “A” and length between 4 and 8

        String[] arraynames = {"Samikshya", "Annapura", "Abinav", "Sujan", "Sanjay"};
        List<String> names = Arrays.asList(arraynames);

        List result = names.stream().filter(s -> s.startsWith("A")).filter(s -> s.length() >= 4 && s.length() < 8).collect(Collectors.toList());

        System.out.println(result);
    }
}
