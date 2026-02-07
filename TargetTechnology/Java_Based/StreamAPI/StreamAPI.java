import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {

        // From a Collection
        List<String> list = Arrays.asList("Java", "Python", "C++");
        Stream<String> streamFromCollection = list.stream();

        // From an Array
        String[] arr = { "A", "B", "C" };
        Stream<String> stream2 = Arrays.stream(arr);

        // Using Stream.of()
        Stream<String> stream3 = Stream.of("X", "Y", "Z");

        // Infinite Stream (limit to avoid infinite loop)
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 1).limit(10);
        infiniteStream.forEach(System.out::println);
    }
}
