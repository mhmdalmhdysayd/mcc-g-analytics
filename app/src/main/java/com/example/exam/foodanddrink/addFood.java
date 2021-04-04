package com.example.exam.foodanddrink;

import java.util.ArrayList;

public class addFood {
    private addFood(){}

    public static ArrayList<Component> addAllFood(){

        ArrayList<Component> components = new ArrayList<>();
        components.add(new Component(1, R.string.pastawithbalsamic, R.string.Ingredients_pastawithbalsamic,
                R.string.way_pastawithbalsamic, R.drawable.pashamel, R.drawable.ic_restaurant_menu_black_24dp));
        components.add(new Component(1, R.string.BiryaniChickenRice, R.string.Ingredients_BiryaniChickenRice,
                R.string.way_BiryaniChickenRice, R.drawable.biryanichickenrice, R.drawable.ic_restaurant_menu_black_24dp));
        components.add(new Component(1, R.string.pizza, R.string.Ingredients_pizza,
                R.string.way_pizza, R.drawable.pizza, R.drawable.ic_restaurant_menu_black_24dp));
        components.add(new Component(1, R.string.Inverted, R.string.Ingredients_Inverted,
                R.string.way_Inverted, R.drawable.inverted, R.drawable.ic_restaurant_menu_black_24dp));
        components.add(new Component(1, R.string.suncel, R.string.Ingredients_suncel,
                R.string.way_suncel, R.drawable.suncel, R.drawable.ic_restaurant_menu_black_24dp));

        components.add(new Component(2, R.string.crepewithnutella, R.string.Ingredients_crepewithnutella,
                R.string.way_crepewithnutella, R.drawable.crepewithnutella, R.drawable.ic_cake_black_24dp));
        components.add(new Component(2, R.string.chase_cake, R.string.Ingredients_chase_cake,
                R.string.way_chase_cake, R.drawable.chasecake, R.drawable.ic_cake_black_24dp));
        components.add(new Component(2, R.string.thenescafecake, R.string.Ingredients_thenescafecake,
                R.string.way_thenescafecake, R.drawable.thenescafecake, R.drawable.ic_cake_black_24dp));
        components.add(new Component(2, R.string.ornamentsofthemarshmallow, R.string.Ingredients_ornamentsofthemarshmallow,
                R.string.way_ornamentsofthemarshmallow, R.drawable.ornamentsofthemarshmallow, R.drawable.ic_cake_black_24dp));
        components.add(new Component(2, R.string.cookbad, R.string.Ingredients_cookbad,
                R.string.way_cookbad, R.drawable.cookbad, R.drawable.ic_cake_black_24dp));

        components.add(new Component(3, R.string.cocktail, R.string.Ingredients_cocktail,
                R.string.way_cocktail, R.drawable.cocktail, R.drawable.ic_vegetables_juice));
        components.add(new Component(3, R.string.carob, R.string.Ingredients_carob,
                R.string.way_carob, R.drawable.carob, R.drawable.ic_vegetables_juice));
        components.add(new Component(3, R.string.hibiscus, R.string.Ingredients_hibiscus,
                R.string.way_hibiscus, R.drawable.hibiscus, R.drawable.ic_vegetables_juice));
        components.add(new Component(4, R.string.cappuccino, R.string.Ingredients_cappuccino,
                R.string.way_cappuccino, R.drawable.cappuccino, R.drawable.ic_chocolate));
        components.add(new Component(4, R.string.chocolate, R.string.Ingredients_chocolate,
                R.string.way_chocolate, R.drawable.chocolate, R.drawable.ic_chocolate));
        return components;
    }
}
