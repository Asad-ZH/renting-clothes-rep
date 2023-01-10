package com.ueteducation.rentingclothes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e){
        return new ResponseEntity<>(new ApiException(e.getMessage(), e, HttpStatus.BAD_REQUEST, ZonedDateTime.now()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {NotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(NotFoundException e){
        return new ResponseEntity<>(new ApiException(e.getMessage(), e, HttpStatus.NOT_FOUND, ZonedDateTime.now()), HttpStatus.BAD_REQUEST);
    }

}
