package com.example.gamesapi.controller;

import com.example.gamesapi.entity.Game;
import com.example.gamesapi.service.GameService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.gamesapi.utils.constants.ConstantsURL.GAMES;
import static com.example.gamesapi.utils.constants.ConstantsURL.ID_PARAM;


@AllArgsConstructor
@RestController()
@RequestMapping(GAMES)
public class GameController {

    private final GameService gameService;

    @GetMapping(ID_PARAM)
    public ResponseEntity<Game> getGameById(@PathVariable Long id) {
        return ResponseEntity.ok(gameService.getGameById(id));
    }

    @PostMapping
    public ResponseEntity<Game>  createGame(@RequestBody Game game) {
        return ResponseEntity.ok(gameService.createGame(game));
    }

    @PutMapping(ID_PARAM)
    public ResponseEntity<Game>  updateGame(@PathVariable Long id, @RequestBody Game game) {
        return ResponseEntity.ok(gameService.updateGame(id, game));
    }

    @DeleteMapping(ID_PARAM)
    public void deleteGame(@PathVariable Long id) {
        gameService.deleteGame(id);

    }
}
