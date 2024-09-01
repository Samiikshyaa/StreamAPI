package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6to10 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, -3, 4, 67, 80, 31, 32, -1);

//    Create a list of Integers and filter the even numbers.
        System.out.println("Even numbers are: ");
        numbers.stream().filter(y -> y % 2 == 0).forEach(y -> System.out.println(y));

//    Create a list of Integer and filter the odd numbers
        System.out.println("Odd numbers are: ");
        numbers.stream().filter(y -> y % 2 != 0).forEach(y -> System.out.println(y));

//        Create a list of Integers and filter the positive numbers.
        System.out.println("The positive numbers are: ");
        numbers.stream().filter(y -> y>=0).forEach(y -> System.out.println(y));

//        Create a list of Integers and filter the negative numbers.
        System.out.println("The negative numbers are: ");
        numbers.stream().filter(y-> y<0).forEach(y-> System.out.println(y));

//        Create a list of Integers and map it to the square of every element and collect it to set.
        System.out.println("The square map: ");
        List square=numbers.stream().map(y -> y*y).collect(Collectors.toList());
//        numbers.stream().map(y -> y*y).forEach(y -> System.out.println(y));
        System.out.println(square);

    }
}
