package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Vegetable {
    private String name;
    private int calories; // Калорийность на 100 грамм

    public Vegetable(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name + " (" + calories + " калорий)";
    }
}

class Salad {
    private List<Vegetable> ingredients;

    public Salad() {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(Vegetable vegetable) {
        ingredients.add(vegetable);
    }

    public int calculateTotalCalories() {
        return ingredients.stream().mapToInt(Vegetable::getCalories).sum();
    }

    public void sortIngredientsByCalories() {
        ingredients.sort(Comparator.comparingInt(Vegetable::getCalories));
    }

    public List<Vegetable> findVegetablesByCalorieRange(int min, int max) {
        List<Vegetable> result = new ArrayList<>();
        for (Vegetable vegetable : ingredients) {
            if (vegetable.getCalories() >= min && vegetable.getCalories() <= max) {
                result.add(vegetable);
            }
        }
        return result;
    }

    public void printIngredients() {
        System.out.println("Состав салата:");
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable);
        }
    }
}
