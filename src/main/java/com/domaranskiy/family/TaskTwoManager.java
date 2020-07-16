package com.domaranskiy.family;

import com.domaranskiy.family.FamilyObject.Family;
import com.domaranskiy.family.io.InitFamily;
import com.domaranskiy.family.io.PrintFamily;
import com.domaranskiy.family.servis.ComparableByName;
import com.domaranskiy.family.servis.ComparatorByNameOfEmblem;
import com.domaranskiy.family.servis.ComparatorByTitle;

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