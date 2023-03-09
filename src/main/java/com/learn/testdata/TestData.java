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

    public static List<Recipe> returnRecipesList() {
        List<Recipe> basicCollection = new ArrayList<>();
        basicCollection.add(new Recipe("Salmon pasta", 1200));
        basicCollection.add(new Recipe("Spaghetti Carbonara", 2000));
        basicCollection.add(new Recipe("Shakshuka", 1200));
        basicCollection.add(new Recipe("Khachapuri", 1700));
        return basicCollection;
    }

}
