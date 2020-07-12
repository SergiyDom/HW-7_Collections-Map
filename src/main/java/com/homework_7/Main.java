package com.homework_7;

import com.homework_7.task_1_duplicate_with_string.TaskOneManager;
import com.homework_7.task_2_family.TaskTwoManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task One begin:");
        TaskOneManager taskOne = new TaskOneManager();
        taskOne.getRidDuplicate();
        System.out.println("\nTask Two begin:");
        TaskTwoManager taskTwoManager = new TaskTwoManager();
        taskTwoManager.sortMapByThreeMethod();
    }
}