package com.domaranskiy.duplicate_with_string.io;

import java.io.IOException;

public interface IData extends IPrinter, IReader {
    default String input(String text) throws IOException {
        print(text);
        return read();
    }
}