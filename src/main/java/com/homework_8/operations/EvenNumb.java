package com.homework_8.operations;

import java.util.List;

public class EvenNumb {
    public void getEvenNumb(List<Integer> list) {
        System.out.print("numbers divisible by 2: ");
        list.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}