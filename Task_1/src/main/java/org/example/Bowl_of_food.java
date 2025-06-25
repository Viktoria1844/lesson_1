package org.example;

public class Bowl_of_food {
    private int foodAmount;

    public Bowl_of_food(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFood(int countFood) {
        if (foodAmount >= countFood) {
            foodAmount -= countFood;
            return countFood;
        } else {
            foodAmount = 0;
            return 0;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавили " + amount);
        }
    }

    public int FoodAmount() {
        return foodAmount;
    }
}
