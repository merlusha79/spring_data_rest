package com.learning.data.rest.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="athletes")
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
