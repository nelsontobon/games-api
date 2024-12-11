package com.example.gamesapi.controller.impl;

import com.example.gamesapi.controller.IGameController;
import com.example.gamesapi.entity.Game;
import com.example.gamesapi.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController()
public class GameControllerImpl implements IGameController {

    private final GameService gameService;

    public ResponseEntity<Game> getGameById(@PathVariable Long id) {
        return ResponseEntity.ok(gameService.getGameById(id));
    }

    public ResponseEntity<Game>  createGame(@RequestBody Game game) {
        return ResponseEntity.ok(gameService.createGame(game));
    }

    public ResponseEntity<Game>  updateGame(@PathVariable Long id, @RequestBody Game game) {
        return ResponseEntity.ok(gameService.updateGame(id, game));
    }

    public void deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);
    }
}
