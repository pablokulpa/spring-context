package com.codecool;

public class ConverterApplication {

    public static void main( String[] args ){
        SimpleCsvConverter simpleCsvConverter = new SimpleCsvConverter();
        ConverterController converterController = new ConverterController(simpleCsvConverter);
        converterController.handleArgs(args);
    }


}
