package com.homework_7.task_1_duplicate_with_string.servis;

import java.util.LinkedHashMap;
import java.util.Map;

public class ServiceDuplicate implements IService {
    @Override
    public String getRidOfDuplicates(String value) {
        value = value.replaceAll(" ", "");
        String delimeter = ",";
        String[] array;
        array = value.split(delimeter);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(Integer.valueOf(array[i]), i);
        }
        return String.valueOf(map.keySet());
    }
}