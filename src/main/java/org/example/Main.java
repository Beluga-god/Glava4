package org.example;

public class Main {
    public static void main(String[] args) {
        // --- Variant A ---
        System.out.println("Задание A:");
        City capital = new City("Москва");
        State state = new State("Россия", capital);

        Region moscowRegion = new Region("Московская область", new City("Москва"), 44998);
        Region leningradRegion = new Region("Ленинградская область", new City("Санкт-Петербург"), 83900);
        Region novosibirskRegion = new Region("Новосибирская область", new City("Новосибирск"), 178200);

        state.addRegion(moscowRegion);
        state.addRegion(leningradRegion);
        state.addRegion(novosibirskRegion);

        state.printCapital();
        System.out.println("Количество областей: " + state.getRegionCount());
        System.out.println("Общая площадь: " + state.getTotalArea() + " км²");
        state.printRegionalCenters();

        // --- Variant B ---
        System.out.println("\nЗадание B:");
        Salad salad = new Salad();
        salad.addIngredient(new Vegetable("Огурец", 15));
        salad.addIngredient(new Vegetable("Помидор", 20));
        salad.addIngredient(new Vegetable("Морковь", 40));

        System.out.println("Общая калорийность: " + salad.calculateTotalCalories() + " калорий");

        salad.sortIngredientsByCalories();
        System.out.println("\nОтсортированные ингредиенты:");
        salad.printIngredients();

        System.out.println("\nИнгредиенты с калорийностью от 15 до 30:");
        for (Vegetable veg : salad.findVegetablesByCalorieRange(15, 30)) {
            System.out.println(veg);
        }
    }
}
