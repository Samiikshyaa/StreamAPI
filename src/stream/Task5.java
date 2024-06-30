package stream;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
//        Create a list of Integers and filter the numbers greater than 50 and less than 100.
        List<Integer> numbers = Arrays.asList(2,3,4,56,1,3,6,2,4,2,67,125,59,90);

        numbers.stream().filter(y -> y>=50 && y<100).forEach(y -> System.out.println(y));
    }
}
