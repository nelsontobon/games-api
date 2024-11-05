package com.example.basicapi.service;

import com.example.basicapi.entity.Game;
import com.example.basicapi.exceptions.GameException;
import com.example.basicapi.repository.IGameRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameService {
    private final IGameRepository gameRepository;

    public Game getGameById(Long id) {
        return gameRepository.findById(id)
                .orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "Game not found"));
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Long id, Game game) {
        gameRepository.findById(id)
                .orElseThrow(() -> new GameException(HttpStatus.NOT_FOUND, "Game not found"));

        return gameRepository.save(game);
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

    public Iterable<Game> getAllGames() {
        return gameRepository.findAll();
    }



}
