package com.spring.demo.exception;

public class ManagementException extends RuntimeException {
    private String errorKey;
    private String detail;

    public ManagementException() {
        super("Create book fail");
        this.errorKey = "1001";
        this.detail = "Content is not null";
    }

    public String getErrorKey() {
        return errorKey;
    }

    public void setErrorKey(String errorKey) {
        this.errorKey = errorKey;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
