package com.alpharamen.customer.data.remote.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.alpharamen.customer.data.models.ConfigModel;

public class LoginBean {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private ConfigModel data = null;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status != null ? status : "";
    }

    public String getMessage() {
        return message != null ? message : "";
    }

    public ConfigModel getData() {
        return data != null ? data : new ConfigModel();
    }

    public LoginBean() {
    }

    public LoginBean(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public static LoginBean failureResponse(){
        return new LoginBean("failure", "An unexpected error occurred");
    }
}
