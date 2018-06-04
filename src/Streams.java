import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {

        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );

        System.out.println();
        System.out.println();

        List<String> people = Arrays.asList("Peter", "Bo", "Ip", "Salik", "Gurli", "Allan", "Mester", "Sullivan");

        people.stream()
                .map(String::toLowerCase)
                .skip(4)
                .filter(x -> x.startsWith("s"))
                .forEach(System.out::println);
    }
}
