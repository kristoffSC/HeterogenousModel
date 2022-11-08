package org.example;

import org.example.model.Dictionary;
import org.example.model.ModelMap;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        ModelMap modelMap = new ModelMap();

        modelMap.put(Dictionary.FIELD_A, "hello");

        //modelMap.put(Dictionary.FIELD_B, "This will not work, compile Time Error"); oh
        modelMap.put(Dictionary.FIELD_B, new Date());

        String value1 = modelMap.get(Dictionary.FIELD_A);
        //Integer value2 = modelMap.get(Dictionary.FIELD_A); //Compile Time error

    }
}
