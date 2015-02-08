package com.shironeko.restaurantservice.data;

import java.util.ArrayList;

/**
 * Created by Ukrit on 8/2/2558.
 */
public class Data {
    public static String IpAddress = "172.168.1.191";
    public static int Port = 8080;

    public static ArrayList<Food> Data_Food = new ArrayList<Food>();
    public static ArrayList<FoodType> Data_FoodType = new ArrayList<FoodType>();
    public static ArrayList<Order> Data_Order = new ArrayList<Order>();
    public static ArrayList<OrderList> Data_OrderList = new ArrayList<OrderList>();

    public static int table;
}
