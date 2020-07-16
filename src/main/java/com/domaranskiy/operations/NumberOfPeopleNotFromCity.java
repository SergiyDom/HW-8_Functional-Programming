package com.domaranskiy.operations;

import com.domaranskiy.list.User;

import java.util.List;

public class NumberOfPeopleNotFromCity {
    public void getNumberOfPeopleNotFromCity(List<User> userList, String cityName) {
        System.out.println("Number Of People Not From " + cityName + ": "
                + userList.stream()
                .filter(user -> !cityName.equals(user.getCity()))
                .count());
    }
}