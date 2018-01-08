package com.codecool;

import java.io.File;

public class ConverterController {

    private SimpleCsvConverter simpleCsvConverter;

    public ConverterController(SimpleCsvConverter simpleCsvConverter) {
        this.simpleCsvConverter = simpleCsvConverter;
    }

    public enum OutputFormat{
        XML, JSON, TABLE
    }

    public void handleArgs(String[] args){
        if(args.length == 0){
            System.out.println("No input file defined");

        } else if(args.length == 1) {
            String path = args[0];
            File file = new File(path);
            simpleCsvConverter.convert(file);

        } else if(args.length == 2) {
            OutputFormat outputFormat = ConverterController.OutputFormat.valueOf(args[0].toUpperCase());
            String path = args[1];
            File file = new File(path);
            simpleCsvConverter.convert(file,outputFormat);
        } else {
            System.out.println("Wrong data");
        }
    }
}
