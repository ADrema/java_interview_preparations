package com.learn.streams;

import com.learn.testdata.TestData;
import java.util.List;

public class ForEachExperiments {
    public static void main(String[] args) {
        List<String> someData = TestData.returnStringDataList();
        System.out.println("Initial list: " + someData);
        someData.forEach(e ->  {
            e += Math.random();
            System.out.println(e);
        });
        System.out.println("After foreach: " + someData);
    }
}
