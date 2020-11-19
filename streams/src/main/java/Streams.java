import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

//        List<String> myList = new ArrayList<String>(Arrays.asList("amanda", "sandy", "alina", "sky"));
//
//        myList
//                .stream()
//                .map(String::toUpperCase)
//                .forEach(result -> System.out.println(result));  // Lambda expression

        Stream.of("amanda", "sandy", "alina", "sky")
                .findFirst()
                .ifPresent(name -> System.out.println(name.toUpperCase()));

        IntStream.range(1, 5)
                .mapToObj(num -> "number: " + num)
                .forEach(System.out::println);

        Stream.of(38.0, 39.0, 40.0, 41.0)
                .mapToInt(Double::intValue)
                .mapToObj(cohort -> "G" + cohort)
                .forEach(System.out::println);
    }
}
