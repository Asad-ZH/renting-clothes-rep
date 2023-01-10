package com.ueteducation.rentingclothes.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private String message;
    private Throwable cause;
    private HttpStatus httpStatus;
    private ZonedDateTime zonedDateTime;

    public ApiException(String message, Throwable cause, HttpStatus httpStatus, ZonedDateTime zonedDateTime) {
        this.message = message;
        this.cause = cause;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getCause() {
        return cause;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    @Override
    public String toString() {
        return "ApiException{" +
                "message='" + message + '\'' +
                ", cause=" + cause +
                ", httpStatus=" + httpStatus +
                ", zonedDateTime=" + zonedDateTime +
                '}';
    }
}
