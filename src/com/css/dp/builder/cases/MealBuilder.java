package com.css.dp.builder.cases;

import com.css.dp.builder.ifs.impls.ex.ChickenBurger;
import com.css.dp.builder.ifs.impls.ex.Coke;
import com.css.dp.builder.ifs.impls.ex.Pepsi;
import com.css.dp.builder.ifs.impls.ex.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
