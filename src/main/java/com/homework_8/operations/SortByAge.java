package com.homework_8.operations;

import com.homework_8.user.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByAge {
    public void getSortByAge(List<User> userList) {
        System.out.println("Sort By Age and limit 3: "
                + userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .limit(3)
                .collect(Collectors.toList()));
    }
}