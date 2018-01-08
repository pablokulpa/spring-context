package com.codecool;

import com.codecool.formatter.OutputFormatter;

import java.io.File;
import java.util.List;

public class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatter outputFormatter;
    private OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter() {
        this.fileReader = new FileReader();
        this.outputFormatterFactory = new OutputFormatterFactory();
    }

    public void convert(File file) {
        outputFormatter = outputFormatterFactory.createByFormat();
        List<String[]> data = fileReader.readData(file);
        outputFormatter.printToConsole(data);
    }

    public void convert(File file, ConverterController.OutputFormat outputFormat){
        outputFormatter = outputFormatterFactory.createByFormat(outputFormat);
        List<String[]> data = fileReader.readData(file);
        outputFormatter.printToConsole(data);
    }


}
