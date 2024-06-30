package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task12 {
    public static void main(String[] args) {
//        Create a list of String and make a single string separate by delimiter ‘|’ pipe.
//                Output should be  ram|shyam|hari|sita
        List<String> names = Arrays.asList("ram","shyam","hari","sita");
        Optional<String> namesAndDelimiter = names.stream().reduce((n1, n2)->n1+"|"+n2);

        if(namesAndDelimiter.isPresent()){
            System.out.println(namesAndDelimiter.get());
        }
    }
}
