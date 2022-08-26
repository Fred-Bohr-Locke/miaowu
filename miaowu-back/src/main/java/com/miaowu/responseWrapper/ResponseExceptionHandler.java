package com.miaowu.responseWrapper;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.miaowu.controller")
public class ResponseExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public Response handleException(Exception e) {
        return new Response(-1, e.getMessage());
    }

}
