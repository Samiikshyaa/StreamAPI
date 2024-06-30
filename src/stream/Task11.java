package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task11 {
    public static void main(String[] args) {
//        Create a list of Integers and sum it using reduce.
        List<Integer> numbers = Arrays.asList(2,3,5,9,10,14,100);
        int sum = numbers.stream().reduce(0,(element1, element2)-> element1+element2);
        System.out.println("The sum is: "+sum);

        Optional<Integer> add = numbers.stream().reduce((element1, element2) -> element1+element2);
        if(add.isPresent()){
            System.out.println(add.get());
        }

    }
}
