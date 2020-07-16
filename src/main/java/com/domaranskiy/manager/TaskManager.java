package com.domaranskiy.manager;

import com.domaranskiy.list.User;
import com.domaranskiy.list.UserList;
import com.domaranskiy.operations.*;
import com.domaranskiy.random.RandomStreaListInteger;

import java.util.List;

public class TaskManager {
    UserList userList = new UserList();
    AverageAgeCity averageAgeLviv = new AverageAgeCity();
    NumberOfPeopleNotFromCity notFromKiev = new NumberOfPeopleNotFromCity();
    OlderThanAge olderThan40 = new OlderThanAge();
    SortByAge sortByAge = new SortByAge();
    YoungerThanAgeFromCity youngerThan50Dnipro = new YoungerThanAgeFromCity();

    RandomStreaListInteger randomStreaListInteger = new RandomStreaListInteger();
    MinMaxValue minMaxValue = new MinMaxValue();
    EvenNumb evenNumb = new EvenNumb();
    IncreaseNumber increaseNumber = new IncreaseNumber();

    public void runTaskManager() {
        averageAgeLviv.getAverageAgeCity(userList.getUserList(), "Lviv");
        notFromKiev.getNumberOfPeopleNotFromCity(userList.getUserList(), "Kiev");
        olderThan40.getOlderThanAge(userList.getUserList(), 40);
        sortByAge.getSortByAge(userList.getUserList(), 3);
        youngerThan50Dnipro.getYoungerThanAgeFromCity(userList.getUserList(), 50, "Dnipro");

        List<Integer> list = randomStreaListInteger.generateRandomIntegerListOfOptionOne();
        System.out.println("My Random list: " + list);
        minMaxValue.getMinValue(list);
        minMaxValue.getMaxValue(list);
        evenNumb.getEvenNumb(list, 2);
        increaseNumber.getIncreaseNumber(list, 10);
    }

    User obj1 = new User("Nikita", 18, "Kiev");
    User obj2 = new User("Nikita", 18, "Kiev");

    public boolean equalsObj() {
        return obj1.equals(obj2);
    }
}