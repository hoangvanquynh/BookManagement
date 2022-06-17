package com.spring.demo.error;

import java.util.List;

public class ManagerErrors {
    private boolean status;
    private List<Error> errors;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }
}
