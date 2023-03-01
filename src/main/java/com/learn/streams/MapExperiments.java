package com.learn.streams;

import com.learn.testdata.TestData;
import java.util.Arrays;
import java.util.List;

public class MapExperiments {

    public static void main(String[] args) {
        // Some experiments with the lists
        List<String> someData = TestData.returnStringDataList();
        List<Integer> numbersList = someData.stream().map(String::length).toList(); // method reference
        // or List<Integer> numbersList = someData.stream().map(el -> el.length()).toList(); // lambda expression

        System.out.println("Initial list: " + someData); // initial list is not changing
        System.out.println("List with data lengths: " + numbersList);

        // Experiments with the arrays
        int[] numbersArray = numbersList.stream().mapToInt(Integer::intValue).toArray();
        int[] modifiedArray = Arrays.stream(numbersArray).map(el -> el - 5).toArray();

        System.out.println("Initial list: " + Arrays.toString(numbersArray));
        System.out.println("Array with data lengths: " + Arrays.toString(modifiedArray));

    }
}
