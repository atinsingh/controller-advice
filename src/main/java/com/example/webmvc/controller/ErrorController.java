package com.example.webmvc.controller;

import com.example.webmvc.BadNameException;
import com.example.webmvc.DuplicateIdentifyException;
import com.example.webmvc.domain.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(BadNameException.class)
    public ResponseEntity<?> handleBadName(Exception ex){
        return ResponseEntity.badRequest().body(
                ErrorResponse.builder().errorCode("401")
                .message(ex.getMessage())
                .applicationId("1234")
                .build());
    }

    @ExceptionHandler(DuplicateIdentifyException.class)
    public ResponseEntity<?> handleDuplicate(Exception ex){
        return ResponseEntity.badRequest().body(
                ErrorResponse.builder().errorCode("2032")
                        .message(ex.getMessage())
                        .applicationId("1234")
                        .build());
    }
}
