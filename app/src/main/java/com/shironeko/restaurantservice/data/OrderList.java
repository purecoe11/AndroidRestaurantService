package com.shironeko.restaurantservice.objectunit;

/**
 * Created by Tossapon on 23/1/2558.
 */
public class OrderList {
    private int orderlistId;
    private int orderId;
    private int foodId;
    private int count;
    private boolean isServe;

    public OrderList(int orderId, int foodId, int count, boolean isServe) {
        this.orderId = orderId;
        this.foodId = foodId;
        this.count = count;
        this.isServe = isServe;
    }

    public OrderList(int orderlistId, int orderId, int foodId, int count, boolean isServe) {
        this.orderlistId = orderlistId;
        this.orderId = orderId;
        this.foodId = foodId;
        this.count = count;
        this.isServe = isServe;
    }

    public int getOrderlistId() {
        return orderlistId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public int getCount() {
        return count;
    }

    public boolean isServe() {
        return isServe;
    }

    public void setOrderlistId(int orderlistId) {
        this.orderlistId = orderlistId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setServe(boolean isServe) {
        this.isServe = isServe;
    }
}
