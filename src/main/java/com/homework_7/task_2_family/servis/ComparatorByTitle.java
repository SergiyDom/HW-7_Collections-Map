package com.homework_7.task_2_family.servis;

import com.homework_7.task_2_family.FamilyObject.Family;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorByTitle implements Comparator<Family> {

    @Override
    public int compare(Family o1, Family o2) {
        return o2.getTitle().toString().compareTo(o1.getTitle().toString());
    }

    public void comparatorByTitle(List list) {
        System.out.println("sort by Title alphabet DESC:");
        Collections.sort(list, new ComparatorByTitle());
    }
}