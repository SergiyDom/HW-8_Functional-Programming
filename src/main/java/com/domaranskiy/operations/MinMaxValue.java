package com.domaranskiy.operations;

import java.util.List;

public class MinMaxValue {
    public void getMinValue(List<Integer> list) {
        System.out.println("Min Value: " + list.stream()
                .min(Integer::compareTo));
    }

    public void getMaxValue(List<Integer> list) {
        System.out.println("Min Value: " + list.stream()
                .max(Integer::compareTo));
    }
}