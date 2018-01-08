package com.codecool;

import com.codecool.formatter.JsonOutputFormatter;
import com.codecool.formatter.OutputFormatter;
import com.codecool.formatter.TableOutputFormatter;
import com.codecool.formatter.XmlOutputFormatter;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(){
        return new TableOutputFormatter();
    }

    public OutputFormatter createByFormat(ConverterController.OutputFormat outputFormat){
        OutputFormatter outputFormatter = null;

        if (outputFormat.equals(ConverterController.OutputFormat.JSON)) {
            outputFormatter = new JsonOutputFormatter();

        } else if (outputFormat.equals(ConverterController.OutputFormat.XML)) {
            outputFormatter = new XmlOutputFormatter();
        }

        return outputFormatter;
    }

}
