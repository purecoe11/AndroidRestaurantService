package com.shironeko.restaurantservice.data;

/**
 * Created by Tossapon on 23/1/2558.
 */
public class FoodType {
    private int foodTypeId;
    private String foodTypeName;

    public int getFoodTypeId() {
        return foodTypeId;
    }

    public String getFoodTypeName() {
        return foodTypeName;
    }

    public FoodType(int id, String foodTypeName) {
        this.foodTypeId = id;
        this.foodTypeName = foodTypeName;
    }

    public void setFoodTypeName(String foodTypeName) {
        this.foodTypeName = foodTypeName;
    }

    public void setFoodTypeId(int foodTypeId) {
        this.foodTypeId = foodTypeId;
    }
}
