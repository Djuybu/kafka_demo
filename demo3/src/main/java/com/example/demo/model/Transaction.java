package com.example.demo.model;

public class Transaction {
    public Transaction(String user_id, String price, String time) {
        this.user_id = user_id;
        this.price = price;
        this.time = time;
    }

    private String user_id;
    private String price;
    private String time;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}