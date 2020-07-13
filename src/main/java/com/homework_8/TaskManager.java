package com.homework_8;

import com.homework_8.operations.*;
import com.homework_8.random.RandomStreaListInteger;
import com.homework_8.user_list.UserList;

import java.util.List;

public class TaskManager {
    UserList userList = new UserList();
    AverageAgeLviv averageAgeLviv = new AverageAgeLviv();
    NumberOfPeopleNotFromKiev notFromKiev = new NumberOfPeopleNotFromKiev();
    OlderThan40 olderThan40 = new OlderThan40();
    SortByAge sortByAge = new SortByAge();
    YoungerThan50Dnipro youngerThan50Dnipro = new YoungerThan50Dnipro();

    RandomStreaListInteger randomStreaListInteger = new RandomStreaListInteger();
    MinMaxValue minMaxValue = new MinMaxValue();
    EvenNumb evenNumb = new EvenNumb();
    IncreaseNumber increaseNumber = new IncreaseNumber();

    public void runTaskManager() {
        averageAgeLviv.getAverageAgeLviv(userList.getUserList());
        notFromKiev.getNumberOfPeopleNotFromKiev(userList.getUserList());
        olderThan40.getOlderThan40(userList.getUserList());
        sortByAge.getSortByAge(userList.getUserList());
        youngerThan50Dnipro.getYoungerThan50Dnipro(userList.getUserList());

        List<Integer> list = randomStreaListInteger.initMethodOne();
        System.out.println("My Random list: " + list);
        minMaxValue.getMinValue(list);
        minMaxValue.getMaxValue(list);
        evenNumb.getEvenNumb(list);
        increaseNumber.getIncreaseNumber(list);
    }
}