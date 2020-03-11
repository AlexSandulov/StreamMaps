package StreamMaps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c", "d");

        List<String> collect = letters.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        List<String> added = letters.stream().map(n -> n + "a").collect(Collectors.toList());
        System.out.println(added);
    }
}
