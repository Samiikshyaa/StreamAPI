package stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task32 {
    public static void main(String[] args) {
        //       32. Given a String, find the first non-repeated character in it using Stream functions?
        String s1 = new String("Samikshya").toLowerCase();
        char nch = s1.chars().mapToObj(y -> (char)y).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting())).entrySet()
                .stream()
                .filter(entry -> entry.getValue()==1).map(entry -> entry.getKey()).findFirst().orElse(null);
        System.out.println("The first non-repeated character in the give string is: "+nch);


//       33. Given a String, find the first repeated character in it using Stream functions?
        String s = "taitaifish";
        char ch = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey()).findFirst().orElse(null);
        System.out.println("The first repeated character in the given string is: "+ch);
    }
}
