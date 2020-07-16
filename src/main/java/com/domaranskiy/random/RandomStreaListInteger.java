package com.domaranskiy.random;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomStreaListInteger {
    List<Integer> integerList;

    public List<Integer> generateRandomIntegerListOfOptionOne() {
        int streamSize = 15;
        int randomNumberOrigin = 1;
        int randomNumberBound = 100;
        integerList = new Random()
                .ints(streamSize, randomNumberOrigin, randomNumberBound)
                .boxed()
                .collect(Collectors.toList());
        return integerList;
    }

    public void generateRandomIntegerListOfOptionTwo() {
        int greaterThan = 0;
        int lessThan = 50;
        int limit = 15;
        integerList = new Random()
                .ints()
                .filter(i -> i > greaterThan && i < lessThan)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());
    }

    public void generateRandomIntegerListOfOptionThree() {
        int streamSize = 15;
        integerList = new Random()
                .ints(streamSize)
                .boxed()
                .collect(Collectors.toList());
    }

    public void generateRandomIntegerListOfOptionFour() {
        int limit = 15;
        Stream.generate(()
                -> (int) (Math.random() * 100))
                .limit(limit)
                .collect(Collectors.toList());
    }
}