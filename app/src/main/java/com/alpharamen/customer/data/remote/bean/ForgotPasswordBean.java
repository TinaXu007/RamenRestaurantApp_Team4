package com.alpharamen.customer.data.remote.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForgotPasswordBean {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status != null ? status : "";
    }

    public String getMessage() {
        return message != null ? message : "";
    }

    public ForgotPasswordBean() {
    }

    public ForgotPasswordBean(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static ForgotPasswordBean failureResponse(){
        return new ForgotPasswordBean("failure", "An unexpected error occurred");
    }
}
