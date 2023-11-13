package com.alpharamen.customer.data.remote.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.alpharamen.customer.data.models.SplashModel;

public class SplashBean {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private SplashModel data = null;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status != null ? status : "";
    }

    public String getMessage() {
        return message != null ? message : "";
    }

    public SplashModel getData() {
        return data != null ? data : new SplashModel();
    }

    public SplashBean() {
    }

    public SplashBean(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static SplashBean failureResponse(){
        return new SplashBean("failure", "An unexpected error occurred");
    }
}
