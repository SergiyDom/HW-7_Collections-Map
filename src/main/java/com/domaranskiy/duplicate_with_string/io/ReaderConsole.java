package com.domaranskiy.duplicate_with_string.io;

import java.io.BufferedReader;
import java.io.IOException;

public class ReaderConsole implements IReader {
    BufferedReader scanner;

    public ReaderConsole(BufferedReader scanner) {
        this.scanner = scanner;
    }

    @Override
    public String read() throws IOException {
        return scanner.readLine();
    }
}