package com.shironeko.restaurantservice.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Tossapon on 23/1/2558.
 */
public class Order {
    private int orderId;
    private int orderTable;
    private Date orderDate;
    private boolean isCheckout;

    public Order(int orderTable, Date orderDate, boolean isCheckout) {
        this.orderTable = orderTable;
        this.orderDate = orderDate;
        this.isCheckout = isCheckout;
    }

    public Order(int orderId, int orderTable, Date orderDate, boolean isCheckout) {
        this.orderId = orderId;
        this.orderTable = orderTable;
        this.orderDate = orderDate;
        this.isCheckout = isCheckout;
    }

    public Order(int orderId, int orderTable, String orderDate, boolean isCheckout) {
        this.orderId = orderId;
        this.orderTable = orderTable;
        this.isCheckout = isCheckout;

        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy:HH:mm:SS");
        try {
            d = simpleDateFormat.parse(orderDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.orderDate = d;
    }

    public void setOrderTable(int orderTable) {
        this.orderTable = orderTable;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setCheckout(boolean isCheckout) {
        this.isCheckout = isCheckout;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getOrderTable() {
        return orderTable;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public boolean isCheckout() {
        return isCheckout;
    }
}
