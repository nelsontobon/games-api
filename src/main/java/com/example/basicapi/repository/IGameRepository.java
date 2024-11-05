package com.example.basicapi.repository;

import com.example.basicapi.entity.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface IGameRepository extends CrudRepository<Game, Long> {
}
