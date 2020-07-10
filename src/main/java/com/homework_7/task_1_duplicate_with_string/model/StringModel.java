package com.homework_7.task_1_duplicate_with_string.model;

import com.homework_7.task_1_duplicate_with_string.io.IData;
import com.homework_7.task_1_duplicate_with_string.io.IPrinter;
import com.homework_7.task_1_duplicate_with_string.servis.IService;

import java.io.IOException;

public class StringModel {
    String oldValue;
    String newValue;

    public void init(IData data) {
        try {
            oldValue = data.input("Enter numbers as a single line ");
        } catch (IOException e) {
            System.out.println("Exception with ReadConsole!!!");
            e.printStackTrace();
        }
    }

    public void ridOfDuplicates(IService service) {
        newValue = service.getRidOfDuplicates(oldValue);
    }

    public void done(IPrinter printer) {
        printer.print("Result: ");
        printer.print(newValue);
    }
}
