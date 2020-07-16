package com.domaranskiy.duplicate_with_string.io;

import java.io.IOException;
import java.util.Map;

public class Data implements IData {
    private IReader reader;
    private IPrinter printer;

    public Data(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void print(Map map) {
        printer.print(map);
    }

    @Override
    public String read() throws IOException {
        return reader.read();
    }
}