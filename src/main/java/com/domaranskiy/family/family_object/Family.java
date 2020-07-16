package com.domaranskiy.family.family_object;

import com.domaranskiy.family.NobleTitles;

import java.util.Objects;

public class Family implements Comparable<Family> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return quantityMember == family.quantityMember &&
                Objects.equals(name, family.name) &&
                title == family.title &&
                Objects.equals(nameOfEmblem, family.nameOfEmblem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quantityMember, title, nameOfEmblem);
    }
}