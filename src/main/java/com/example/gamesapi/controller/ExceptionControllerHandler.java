package com.example.gamesapi.controller;

import com.example.gamesapi.exceptions.GameException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ExceptionControllerHandler {

    @ExceptionHandler(GameException.class)
    ResponseEntity<?> handleGameException(GameException ex) {
        HashMap<String, Object> response = new HashMap<>(){{
            put("message", ex.getMessage());
            put("status", ex.getStatus().value());
        }};
        return ResponseEntity.status(ex.getStatus()).body(response);
    }
}
