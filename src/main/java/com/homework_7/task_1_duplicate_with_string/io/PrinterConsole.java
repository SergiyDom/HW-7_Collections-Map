package com.homework_7.task_1_duplicate_with_string.io;

import java.util.Map;

public class PrinterConsole implements IPrinter {
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void print(Map map) {
        System.out.println(map.keySet());
    }
}