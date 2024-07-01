package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Try {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 9, 10);
        List nlist = num.stream().collect(Collectors.toList());
        System.out.println(nlist);

//        num.stream().forEach(y -> System.out.println(y));
//        System.out.println(s.toString());

        String s = "Samikshya";
        s.chars().forEach(y -> System.out.println((char)y));
    }
}
