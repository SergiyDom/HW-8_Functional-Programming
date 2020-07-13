package com.homework_8.random;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomStreaListInteger {
    List<Integer> integerList;

    public List<Integer> initMethodOne() {
        integerList = new Random()
                .ints(15, 1, 100)
                .boxed()
                .collect(Collectors.toList());
        return integerList;
    }

    public void initMethodTwo() {
        integerList = new Random()
                .ints()
                .filter(i -> i > 0 && i < 50)
                .limit(15)
                .boxed()
                .collect(Collectors.toList());
    }

    public void initMethodThree() {
        integerList = new Random()
                .ints(15)
                .boxed()
                .collect(Collectors.toList());
    }

    public void initMethodFour() {
        Stream.generate(()
                -> (int) (Math.random() * 100))
                .limit(15)
                .collect(Collectors.toList());
    }
}