package com.shironeko.restaurantservice.objectunit;

/**
 * Created by Tossapon on 23/1/2558.
 */
public class Food {
    private int foodId;
    private String foodName;
    private double foodPrice;
    private String foodPicturePath;
    private int foodTypeId;

    public Food(int foodId, String foodName, double foodPrice, String foodPicturePath, int foodTypeId) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodPicturePath = foodPicturePath;
        this.foodTypeId = foodTypeId;
    }

    public Food(String foodName, double foodPrice, String foodPicturePath, int foodTypeId) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodPicturePath = foodPicturePath;
        this.foodTypeId = foodTypeId;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public String getFoodPicturePath() {
        return foodPicturePath;
    }

    public int getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodPicturePath(String foodPicturePath) {
        this.foodPicturePath = foodPicturePath;
    }

    public void setFoodTypeId(int foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }
}
