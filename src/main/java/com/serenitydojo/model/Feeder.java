package com.serenitydojo.model;

import static com.serenitydojo.model.AnimalType.CAT;
import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(AnimalType animal, boolean isPremium) {


        switch (animal) {
            case CAT:
                return (isPremium == true) ? SALMON : TUNA;

            case DOG:
                return (isPremium == true) ? DELUXE_DOG_FOOD : DOG_FOOD;

            case HAMSTER:
                return (isPremium == true) ? LETTUCE : CABBAGE;

            default:
                return UNKNOWN;

        }

    }
}