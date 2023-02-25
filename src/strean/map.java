package strean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Costa Rica", "Greece", "Malaysia", "Peru");
        List<Integer> numbers = countries.stream()
                .map(country -> country.split("\\s+"))
                .flatMap(Arrays::stream)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(numbers);
    }
}
