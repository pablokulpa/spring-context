package com.codecool.formatter;

import com.fasterxml.jackson.xml.XmlMapper;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.util.List;

public class XmlOutputFormatter implements OutputFormatter{
    public void printToConsole(List<String[]> data) {
        System.out.println("XML format");
        XmlMapper xmlMapper = new XmlMapper();
        try {
            System.out.println(xmlMapper.writeValueAsString(data));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
