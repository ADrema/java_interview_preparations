package com.learn.streams;

import com.learn.testdata.TestData;
import java.util.List;

public class FilterExperiments {

    public static void main(String[] args) {
        List<String> someData = TestData.returnStringDataList();
        List<String> filteredList = someData.stream().filter(e -> e.startsWith("F")).toList();
        System.out.println(filteredList);
    }
}
