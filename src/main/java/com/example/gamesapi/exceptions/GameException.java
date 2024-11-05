package com.example.gamesapi.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class GameException extends RuntimeException{
    HttpStatus status;

    public GameException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }
}
