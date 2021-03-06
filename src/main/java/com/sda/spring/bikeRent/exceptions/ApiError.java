package com.sda.spring.bikeRent.exceptions;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ApiError {

    private HttpStatus status;
    private String message;
    private List<String> error;

    public ApiError(HttpStatus status, String message, List<String> error) {
        this.status = status;
        this.message = message;
        this.error = error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }
}
