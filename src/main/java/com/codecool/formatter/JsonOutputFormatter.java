package com.codecool.formatter;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;;

public class JsonOutputFormatter implements OutputFormatter{

    public void printToConsole(List<String[]> data) {

        JSONObject record = new JSONObject();
        String[] headers = data.get(0);


        for(int i=1;i<data.size(); i++) {
            for(int j=0; j<headers.length; j++) {

                try {
                    record.put(headers[j], data.get(i)[j]);
                } catch (JSONException e) {
                    System.out.println("Wrong data csv");
                }
            } System.out.println(record);
        }
    }
}

