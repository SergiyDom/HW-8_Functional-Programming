package com.domaranskiy.operations;

import java.util.List;

public class EvenNumb {
    public void getEvenNumb(List<Integer> list, int i) {
        System.out.print("numbers divisible by " + i + ": ");
        list.stream()
                .filter(integer -> integer % i == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}