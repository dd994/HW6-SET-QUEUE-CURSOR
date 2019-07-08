package main.java;

import java.util.Comparator;

public class ownCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 % 2 == 0) {
            if (o2 % 2 == 0) {
                return o1 - o2;
            }
            return -1;
        } else if (o2 % 2 == 0) {
            return 1;
        }
        return o1 - o2;
    }
}