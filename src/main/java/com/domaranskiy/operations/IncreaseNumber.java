package com.domaranskiy.operations;

import java.util.List;

public class IncreaseNumber {
    public void getIncreaseNumber(List<Integer> list, int i) {
        System.out.print("Increase Number by " + i + ": ");
        list.stream()
                .map(integer -> integer + i)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}