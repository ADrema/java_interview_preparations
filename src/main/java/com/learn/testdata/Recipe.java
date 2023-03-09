package com.learn.testdata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
    private String name;
    private int kcal;
    private List<String> ingredients;

    public Recipe(String name, List<String> ingredients, int kcal) {
        this.name = name;
        this.ingredients = ingredients;
        this.kcal = kcal;
    }

    public Recipe(String name, int kcal) {
        this(name, new ArrayList<>(), kcal);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getKcal() {
        return kcal;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name
                + " Kcal: " + this.kcal
                + " Ingredients: " + this.ingredients;
    }
}
