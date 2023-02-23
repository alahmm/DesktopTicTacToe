package set;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String element : nameSet
             ) {
            System.out.println(element);
        }
        // write your code here
    }
}