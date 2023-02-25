package strean;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.*;

import static strean.FunctionUtils.saveStream;

class FunctionUtils {

    public static <T> Supplier<Stream<T>> saveStream(Stream<T> stream){
        List<T> list = stream.toList();
        return  () -> list.stream();
    }

}
class MainN {
    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        Supplier<Stream<Integer>> saved = saveStream(stream.filter(e -> e % 2 == 0));

        System.out.println(saved.get().count());
        System.out.println(saved.get().max(Integer::compareTo).get());
        System.out.println(saved.get().min(Integer::compareTo).get());

    }
}
