package com.homework_7.task_1_duplicate_with_string.io;

import java.io.IOException;

public interface IData extends IPrinter, IReader {
    default String input(String text) throws IOException {
        print(text);
        return read();
    }
}