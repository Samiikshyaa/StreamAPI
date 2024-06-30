package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
//        Create a list of String with 20 different data and display it using stream API.
        List<Integer> numlist = new ArrayList<>();
        numlist.add(2);
        numlist.add(100);
        numlist.add(50);
        numlist.add(10);
        numlist.add(5);
        numlist.add(1);
        numlist.add(0);

        numlist.stream().forEach(y -> System.out.println(y)); //creates the stream with single element
//        .of()     creates the stream iof the single element;
    }
}
