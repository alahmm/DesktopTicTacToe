package strean;

import java.util.*;
import java.util.stream.*;

public class Main4 {

    /**
     * Counts the number of unique words ignoring case sensitivity
     * for given lines with words.
     *
     * @param n     the n lines contain words
     * @param lines the list of lines, each line is a list of words
     * @return the number of unique words in lines ignoring case sensitivity
     */
    public static long count(int n, List<List<String>> lines) {
        List<String> newArray = new ArrayList<>();
        List<String> array = lines.stream().flatMap(Collection::stream).map(String::toUpperCase).collect(Collectors.toList());
            for (int i = 0; i < array.size(); i++) {
                if ( i != 0) {
                    if (!array.get(i).equals(array.get(0))) {
                        if (!newArray.contains(array.get(i))) {
                            newArray.add(array.get(i));
                            array.set(0, array.get(i));
                        }
                    }
                } else {
                    newArray.add(array.get(0));
                }
            }
        return newArray.size();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<List<String>> lines = Stream.generate(scanner::nextLine).limit(n)
                .map(s -> Arrays.asList(s.split("\\s+")))
                .collect(Collectors.toList());

        System.out.println(count(n, lines));
    }
}
