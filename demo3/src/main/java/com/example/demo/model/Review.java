package com.example.demo.model;

public class Review {
    public Review(String user_id, String product_id) {
        this.user_id = user_id;
        this.product_id = product_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public Review(String user_id, String product_id, String content, String time) {
        this.user_id = user_id;
        this.product_id = product_id;
        this.content = content;
        this.time = time;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    private String user_id;
    private String product_id;
    private String content;
    private String time;
}
