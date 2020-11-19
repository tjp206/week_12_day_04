import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Sandy", 40),
                new Person("Hannah", 25),
                new Person("Sky", 35),
                new Person("Juan", 35)
        );

        List<Person> filtered;
        filtered = people
                .stream()
                .filter(person -> person.getName().startsWith("S"))
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);
        System.out.println("names: " + filtered);

        int totalAge = people
                .stream()
                .map(person -> person.getAge())
                .reduce(0, (sum, age) -> sum += age);

        System.out.println(totalAge);
    }
}
