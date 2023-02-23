package comparatorinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Utils {

    public static void sortStrings(List<String> strings) {

        Comparator<String> comparator = String::compareTo;
        strings.sort(comparator.reversed());
    }


}
class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ali");
        list.add("mali");
        Utils.sortStrings(list);
    }
}
