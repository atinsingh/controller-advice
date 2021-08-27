package com.example.webmvc;

public class BadNameException extends RuntimeException{
    public BadNameException(String message) {
        super(message);
    }
}
