package com.domaranskiy.manager;

import com.domaranskiy.list.UserList;
import com.domaranskiy.operations.Operations;
import com.domaranskiy.random.RandomStreaListInteger;

import java.util.List;

public class TaskManager {
    UserList userList = new UserList();
    Operations operations = new Operations();
    RandomStreaListInteger randomStreaListInteger = new RandomStreaListInteger();

    public void runTaskManager() {
        operations.getAverageAgeCity(userList.getUserList(), "Lviv");
        operations.getNumberOfPeopleNotFromCity(userList.getUserList(), "Kiev");
        operations.getOlderThanAge(userList.getUserList(), 40);
        operations.getSortByAge(userList.getUserList(), 3);
        operations.getYoungerThanAgeFromCity(userList.getUserList(), 50, "Dnipro");

        List<Integer> list = randomStreaListInteger.generateRandomIntegerListOfOptionOne();
        System.out.println("My Random list: " + list);
        operations.getMinValue(list);
        operations.getMaxValue(list);
        operations.getEvenNumb(list, 2);
        operations.getIncreaseNumber(list, 10);
    }
}