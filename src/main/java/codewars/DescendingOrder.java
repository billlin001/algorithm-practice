package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.valueOf(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(i))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));

//        return Integer.parseInt(String.valueOf(num)
//                .chars()
//                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.joining()));
    }
}
