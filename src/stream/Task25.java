package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Task25 {
    public static void main(String[] args) {
//        Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        List<Integer> numlist = Arrays.asList(101, 2, 3, 5, 6, 9, 10, 20, 3, 2,101);
        numlist.stream().filter(x -> x % 2 == 0).forEach(y -> System.out.println(y));

//        Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        System.out.println("\nThe numbers starting with 1: ");
        numlist.stream().map(String::valueOf).filter(s -> s.startsWith("1")).map(Integer::valueOf).forEach(y -> System.out.println(y));

//        Find duplicate elements in a given integers list in java using Stream functions.
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int x : numlist) {
            if (hmap.containsKey(x)) {
                hmap.put(x, hmap.get(x) + 1);
            } else {
                hmap.put(x, 1);
            }
        }
        System.out.println("Duplicate Elements are: ");
        hmap.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(entry.getKey()));

//    Given the list of integers, find the first element of the list using Stream functions?
        System.out.println("The first element is: ");
        int first = numlist.stream().reduce((a,b) -> a).orElse(null);
        System.out.println(first);

//    Given a list of integers, find the total number of elements present in the list using Stream functions?
        int counting = (int) numlist.stream().count();
        System.out.println("The size of the list is: "+ counting);

//        Given a list of integers, find the maximum value element present in it using Stream functions?
        int n = numlist.stream().max(Integer::compare).get();
        System.out.println("The maximum value is: "+n);

//        33. Given a list of integers, sort all the values present in it using Stream functions?
        System.out.println("Sorting in ascending order: ");
        List sortedList = numlist.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

//        34. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        System.out.println("Sorting in descending order: ");
        List reverse = numlist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverse);

//       32. Given a String, find the first non-repeated character in it using Stream functions?
        String s1 = new String("Samikshya");


    }


}
