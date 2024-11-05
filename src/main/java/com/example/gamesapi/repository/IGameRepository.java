package com.example.gamesapi.repository;

import com.example.gamesapi.entity.Game;
import org.springframework.data.repository.CrudRepository;

public interface IGameRepository extends CrudRepository<Game, Long> {
}
