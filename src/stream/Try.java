package stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Try {
    public static void main(String[] args) {

////        see repeated wala
//        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 9, 10, 10, 5);
//        num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(entry.getKey()));
//
//
//
//        List nlist = num.stream().collect(Collectors.toList());
//        System.out.println(nlist);
//
////        num.stream().forEach(y -> System.out.println(y));
////        System.out.println(s.toString());
//
//        String s = "Samikshya";
//        s.chars().forEach(y -> System.out.println((char)y));


        String s = "samikshyas";
        Character st = s.chars()
                .mapToObj(y -> (char) y)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1 )
                .map(Map.Entry::getKey)
                .reduce((a, b) -> a)
                .orElse(null);
        System.out.println(st);
    }
}
