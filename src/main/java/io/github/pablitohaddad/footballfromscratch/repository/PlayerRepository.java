package io.github.pablitohaddad.footballfromscratch.repository;

import io.github.pablitohaddad.footballfromscratch.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository  extends JpaRepository<Player, Integer> {
}
