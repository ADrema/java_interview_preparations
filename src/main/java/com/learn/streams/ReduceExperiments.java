package com.learn.streams;

import com.learn.testdata.TestData;
import java.util.List;

public class ReduceExperiments {
    public static void main(String[] args) {
        List<String> someData = TestData.returnStringDataList();
        String result = someData.stream().reduce("", (a, e) -> a + " " + e);
        System.out.println(result);
    }
}
