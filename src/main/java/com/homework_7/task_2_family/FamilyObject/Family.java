package com.homework_7.task_2_family.FamilyObject;

import com.homework_7.task_2_family.NobleTitles;

public class Family implements Comparable<Family>{
    private String name;
    private int quantityMember;
    private NobleTitles title;
    private String nameOfEmblem;

    public Family(String name, int quantityMember, NobleTitles title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {
        return name;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public NobleTitles getTitle() {
        return title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    @Override
    public String toString() {
        return "Family " +
                "name= '" + name + '\'' +
                ", quantityMember= " + quantityMember +
                ", title= " + title +
                ", nameOfEmblem= '" + nameOfEmblem + '\'' +
                '}';
    }

    @Override
    public int compareTo(Family family) {
        return this.name.compareTo(family.getName());
    }
}