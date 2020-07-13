package com.homework_8.operations;

import com.homework_8.user.User;

import java.util.List;

public class NumberOfPeopleNotFromKiev {
    public void getNumberOfPeopleNotFromKiev(List<User> userList) {
        long count = userList.stream()
                .filter(user -> !"Киев".equals(user.getCity()))
                .count();
        System.out.println("Number Of People Not From Kiev: " + count);
    }
}