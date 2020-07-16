package com.domaranskiy.operations;

import com.domaranskiy.list.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByAge {
    public void getSortByAge(List<User> userList, int limit) {
        System.out.println("Sort By Age and limit " + limit + ": "
                + userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .limit(limit)
                .collect(Collectors.toList()));
    }
}