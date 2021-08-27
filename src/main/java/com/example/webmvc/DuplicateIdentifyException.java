package com.example.webmvc;

public class DuplicateIdentifyException extends RuntimeException{
    public DuplicateIdentifyException(String message) {
        super(message);
    }
}
