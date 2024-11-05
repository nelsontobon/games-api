package com.example.basicapi.service;

import com.example.basicapi.entity.Game;
import com.example.basicapi.repository.IGameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GameService {
    private final IGameRepository gameRepository;

    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Long gameId, Game game) {
        gameRepository.findById(gameId)
                .orElseThrow(() -> new RuntimeException("Game not found"));

        return gameRepository.save(game);
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

    public Iterable<Game> getAllGames() {
        return gameRepository.findAll();
    }



}
