package com.serenitydojo.model;


import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {


        switch (animal) {
            case "Cat":
                return (isPremium == true) ? SALMON : TUNA;

            case "Dog":
                return (isPremium == true) ? DELUXE_DOG_FOOD : DOG_FOOD;

            case "Hamster":
                return (isPremium == true) ? LETTUCE : CABBAGE;

            default:
                return UNKNOWN;

        }

    }
}