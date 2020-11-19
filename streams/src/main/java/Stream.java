import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>(Arrays.asList("amanda", "sandy", "alina", "sky"));

        myList
                .stream()
                .map(String::toUpperCase)
                .forEach(result -> System.out.println(result));  // Lambda expression
    }
}
