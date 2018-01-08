package com.codecool;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public List readData(File file){

        List<String[]> data = new ArrayList<String[]>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(",");
                data.add(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No file");
        }
        return data;
    }
}
