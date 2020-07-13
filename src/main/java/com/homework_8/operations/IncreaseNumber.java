package com.homework_8.operations;

import java.util.List;

public class IncreaseNumber {
    public void getIncreaseNumber(List<Integer> list) {
        System.out.print("Increase Number by 10: ");
        list.stream()
                .map(integer -> integer + 10)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}