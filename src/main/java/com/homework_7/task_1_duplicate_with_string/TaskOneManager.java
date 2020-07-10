package com.homework_7.task_1_duplicate_with_string;

import com.homework_7.task_1_duplicate_with_string.io.*;
import com.homework_7.task_1_duplicate_with_string.model.StringModel;
import com.homework_7.task_1_duplicate_with_string.servis.IService;
import com.homework_7.task_1_duplicate_with_string.servis.ServiceDuplicate;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskOneManager {
    public void getRidDuplicate() {
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
}