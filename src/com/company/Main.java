package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        for(Integer num : intList) {
            if (num > 0 && num % 2 == 0) newList.add(num);
        }
        newList.sort(Comparator.naturalOrder());
        newList.forEach(System.out::println);

        System.out.println("\n***** StreamMain *****\n");
        StreamMain.main();
    }

    public class StreamMain {

        public static void main() {
            List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
            intList.stream()
                    .filter(x -> x > 0)
                    .filter(x -> x % 2 == 0)
                    .sorted(Comparator.naturalOrder())
                    .forEach(System.out::println);

        }
    }
}
