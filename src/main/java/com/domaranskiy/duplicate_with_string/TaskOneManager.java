package com.domaranskiy.duplicate_with_string;

import com.domaranskiy.duplicate_with_string.io.*;
import com.domaranskiy.duplicate_with_string.model.StringModel;
import com.domaranskiy.duplicate_with_string.servis.IService;
import com.domaranskiy.duplicate_with_string.servis.ServiceDuplicate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskOneManager {
    private void getRidDuplicate() {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        IReader reader = new ReaderConsole(scanner);
        IPrinter printer = new PrinterConsole();
        IData data = new Data(reader, printer);
        IService service = new ServiceDuplicate();

        StringModel stringModel = new StringModel();
        stringModel.init(data);
        stringModel.ridOfDuplicates(service);
        stringModel.done(printer);
    }

    public static void run() {
        System.out.println("Task One begin:");
        new TaskOneManager().getRidDuplicate();
    }
}