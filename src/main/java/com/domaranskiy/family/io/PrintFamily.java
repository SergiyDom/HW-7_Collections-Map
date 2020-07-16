package com.domaranskiy.family.io;

import java.util.List;
import java.util.Map;

public class PrintFamily {
    public void print(Map map) {
        System.out.println("My map:");
        for (Object o : map.values()) {
            System.out.println(o);
        }
        System.out.println();
    }
    public void print(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    }
}