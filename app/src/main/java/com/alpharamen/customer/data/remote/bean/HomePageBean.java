package com.alpharamen.customer.data.remote.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.alpharamen.customer.data.models.HomepageModel;

import java.util.ArrayList;

public class HomePageBean {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private ArrayList<HomepageModel> data = null;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status != null ? status : "";
    }

    public String getMessage() {
        return message != null ? message : "";
    }

    public ArrayList<HomepageModel> getData() {
        return data != null ? data : new ArrayList<HomepageModel>();
    }

    public HomePageBean() {
    }

    public HomePageBean(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static HomePageBean failureResponse(){
        return new HomePageBean("failure", "An unexpected error occurred");
    }
}
