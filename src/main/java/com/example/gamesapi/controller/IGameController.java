package com.example.gamesapi.controller;

import com.example.gamesapi.entity.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.gamesapi.utils.constants.ConstantsURL.GAMES;
import static com.example.gamesapi.utils.constants.ConstantsURL.ID_PARAM;

@RequestMapping(GAMES)
public interface IGameController {
    @GetMapping(ID_PARAM)
    ResponseEntity<Game> getGameById(@PathVariable Long id);

    @PostMapping
    ResponseEntity<Game>  createGame(@RequestBody Game game);

    @PutMapping(ID_PARAM)
    ResponseEntity<Game>  updateGame(@PathVariable Long id, @RequestBody Game game);

    @DeleteMapping(ID_PARAM)
    void deleteGame(@PathVariable Long id);
}
