package com.learn.testdata;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static List<String> returnStringDataList() {
        List<String> basicCollection = new ArrayList<>();
        basicCollection.add("FirstValue");
        basicCollection.add("SecondValue");
        basicCollection.add("ThirdValue");
        basicCollection.add("FourthValue");
        basicCollection.add("FifthValue");

        return basicCollection;
    }
}
