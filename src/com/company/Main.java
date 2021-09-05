package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int size = 0;
        int num;
        int[] numbers = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] rez = new int[numbers.length-1];
        // фильтр
        for(int a : numbers) {
            if (a > 0 && a % 2 == 0) {
                rez[size] = a;
                size++;
            }
        }
        // сортировка
        for (int i = 0; i < size-1; i++){
            for (int j = i; j >= 0; j--){
                if (rez [j]> rez [j+1]) {
                    num = rez[j];
                    rez [j] = rez [j+1];
                    rez [j+1] = num;
                }
            }
        }
        // вывод на экран
        System.out.println("\n***** arrays *****\n");
        for(int i = 0; i < size; i++) {
            System.out.println(rez[i]);
        }
        // с потоками
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
