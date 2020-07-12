package com.homework_7.task_2_family.servis;

import com.homework_7.task_2_family.FamilyObject.Family;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorByNameOfEmblem implements Comparator<Family> {
    @Override
    public int compare(Family o1, Family o2) {
        return o2.getNameOfEmblem().length() - o1.getNameOfEmblem().length();
    }

    public void comparatorByNameOfEmblem(List list) {
        System.out.println("sort by NameOfEmblem length DESC:");
        Collections.sort(list, new ComparatorByNameOfEmblem());
    }
}