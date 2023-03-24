package com.webservices.restfulservice.bean;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String s) {
        this.message = s;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

}
