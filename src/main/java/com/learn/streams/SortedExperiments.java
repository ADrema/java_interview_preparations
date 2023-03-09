package com.learn.streams;

import com.learn.testdata.Recipe;
import java.util.List;

import static com.learn.testdata.TestData.returnRecipesList;

public class SortedExperiments {

    public static void main(String[] args) {
        List<Recipe> recipes = returnRecipesList();

        recipes = recipes.stream().sorted((r1, r2) -> r1.getName().compareTo(r2.getName())).toList();
        System.out.println(recipes);

    }
}
