package com.domaranskiy.operations;

import com.domaranskiy.list.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {
    public void getAverageAgeCity(List<User> userList, String cityName) {
        System.out.println("Average Age " + cityName + ": "
                + userList.stream()
                .filter(user -> cityName.equals(user.getCity()))
                .mapToInt(User::getAge)
                .average()
                .getAsDouble());
    }

    public void getEvenNumb(List<Integer> list, int i) {
        System.out.print("numbers divisible by " + i + ": ");
        list.stream()
                .filter(integer -> integer % i == 0)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public void getIncreaseNumber(List<Integer> list, int i) {
        System.out.print("Increase Number by " + i + ": ");
        list.stream()
                .map(integer -> integer + i)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    public void getMinValue(List<Integer> list) {
        System.out.println("Min Value: " + list.stream()
                .min(Integer::compareTo));
    }

    public void getMaxValue(List<Integer> list) {
        System.out.println("Min Value: " + list.stream()
                .max(Integer::compareTo));
    }

    public void getNumberOfPeopleNotFromCity(List<User> userList, String cityName) {
        System.out.println("Number Of People Not From " + cityName + ": "
                + userList.stream()
                .filter(user -> !cityName.equals(user.getCity()))
                .count());
    }

    public void getOlderThanAge(List<User> userList, int age) {
        System.out.println("Older Than " + age + ": "
                + userList.stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList()));
    }

    public void getSortByAge(List<User> userList, int limit) {
        System.out.println("Sort By Age and limit " + limit + ": "
                + userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .limit(limit)
                .collect(Collectors.toList()));
    }

    public void getYoungerThanAgeFromCity(List<User> userList, int age, String cityName) {
        System.out.println("User Younger Than " + age + " with " + cityName + ": "
                + userList.stream()
                .filter(u -> u.getAge() < age && cityName.equals(u.getCity()))
                .collect(Collectors.toList()));
    }
}