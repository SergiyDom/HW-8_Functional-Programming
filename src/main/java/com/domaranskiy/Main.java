package com.domaranskiy;

import com.domaranskiy.manager.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager users = new TaskManager();
        users.runTaskManager();
        System.out.println(users.equalsObj());
    }
}