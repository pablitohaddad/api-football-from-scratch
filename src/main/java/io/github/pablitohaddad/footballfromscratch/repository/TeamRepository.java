package io.github.pablitohaddad.footballfromscratch.repository;

import io.github.pablitohaddad.footballfromscratch.model.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    Object findByName(String s);
}
