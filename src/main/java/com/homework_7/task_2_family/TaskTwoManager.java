package com.homework_7.task_2_family;

import com.homework_7.task_2_family.FamilyObject.Family;
import com.homework_7.task_2_family.io.InitFamily;
import com.homework_7.task_2_family.io.PrintFamily;
import com.homework_7.task_2_family.servis.ComparableByName;
import com.homework_7.task_2_family.servis.ComparatorByNameOfEmblem;
import com.homework_7.task_2_family.servis.ComparatorByTitle;

import java.util.*;

public class TaskTwoManager {

    public void sortMapByThreeMethod() {
        InitFamily initFamily = new InitFamily();
        PrintFamily printFamily = new PrintFamily();
        Map<Integer,Family> map = initFamily.init();
        printFamily.print(map);
        List<Family> list = new ArrayList<>(map.values());

        ComparableByName byName = new ComparableByName();
        byName.comparableByName(list);
        printFamily.print(list);

        ComparatorByNameOfEmblem byNameOfEmblem =new ComparatorByNameOfEmblem();
        byNameOfEmblem.comparatorByNameOfEmblem(list);
        printFamily.print(list);

        ComparatorByTitle byTitle = new ComparatorByTitle();
        byTitle.comparatorByTitle(list);
        printFamily.print(list);
    }
}