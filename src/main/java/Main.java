package main.java;

import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>(new ownCompare());
        numbers.add(2);
        numbers.add(5);
        numbers.add(31);
        numbers.add(4);
        numbers.add(8);

        System.out.println(numbers);
    }
}