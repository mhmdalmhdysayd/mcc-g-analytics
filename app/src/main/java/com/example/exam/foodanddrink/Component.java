package com.example.exam.foodanddrink;

public class Component {
    private int tag;
    private int nameFood;
    private int foodIngredients;
    private int wayPrepare;
    private int image;
    private int Icon;

    public Component(int tag,int nameFood, int foodIngredients, int wayPrepare, int image, int icon) {
        this.tag = tag;
        this.nameFood = nameFood;
        this.foodIngredients = foodIngredients;
        this.wayPrepare = wayPrepare;
        this.image = image;
        this.Icon = icon;
    }

    public int getTag() {
        return tag;
    }

    public int getNameFood() {
        return nameFood;
    }

    public int getFoodIngredients() {
        return foodIngredients;
    }

    public int getWayPrepare() {
        return wayPrepare;
    }

    public int getImage() {
        return image;
    }

    public int getIcon() {
        return Icon;
    }
}
