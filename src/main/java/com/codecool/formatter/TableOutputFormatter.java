package com.codecool.formatter;

import java.util.Arrays;
import java.util.List;

public class TableOutputFormatter implements OutputFormatter{
    public void printToConsole(List<String[]> data) {
        for (String[] line : data) {
            System.out.println(Arrays.toString(line));
        }
    }
}
