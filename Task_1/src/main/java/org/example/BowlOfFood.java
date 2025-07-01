package org.example;

public class BowlOfFood {

    final static int MAX_FOOD_AMOUNT = 50;
    public int foodAmount;

    public BowlOfFood(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void addFood(int addedFoodAmount) {
        System.out.print("В миске было еды: " + foodAmount);
        foodAmount += addedFoodAmount;
        if (foodAmount > MAX_FOOD_AMOUNT) {
            foodAmount = MAX_FOOD_AMOUNT;
        }
        System.out.println(". Стало: " + foodAmount);
    }

    public void decFood(int reducedFoodAmount) {
        System.out.print("В миске было еды: " + foodAmount);
        foodAmount -= reducedFoodAmount;
        if (foodAmount < 0) {
            foodAmount = 0;
        }
        System.out.println(". Стало: " + foodAmount);
    }
}
