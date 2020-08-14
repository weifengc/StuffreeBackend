package com.weifengcui.demo.response;

import com.weifengcui.demo.entity.BlogMessage;
import com.weifengcui.demo.entity.User;

public class GeneralResponse {
    public final static GeneralResponse SUCCESS = new GeneralResponse(true, "");

    private boolean isOK;
    private String errorMessage;
    private User user;
    private BlogMessage message;

    public GeneralResponse() {
    }

    public GeneralResponse(boolean isOK, String errorMessage) {
        this.isOK = isOK;
        this.errorMessage = errorMessage;
    }

    public GeneralResponse(boolean isOK, String errorMessage, User user) {
        this.isOK = isOK;
        this.errorMessage = errorMessage;
        this.user = user;
    }

    public GeneralResponse(boolean isOK, String errorMessage, BlogMessage message) {
        this.isOK = isOK;
        this.errorMessage = errorMessage;
        this.message = message;
    }


    public boolean isOK() {
        return isOK;
    }

    public void setOK(boolean OK) {
        isOK = OK;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BlogMessage getMessage() {
        return message;
    }

    public void setMessage(BlogMessage message) {
        this.message = message;
    }
}
