package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,2,3,5,6));
        Collections.sort(list);
        int index = Collections.binarySearch(list, 6);
        System.out.println(index);
        System.out.println(Collections.frequency(list, 5));
        System.out.println(Collections.disjoint(list, Arrays.asList(9,2)));
    }
}
